import numpy as np
import pandas as pd
import matplotlib.pyplot as plot


IrisDataframe = pd.read_csv('Iris Flower Classification\iris.csv', header=None)


class Perceptron(object):
    """
    Perceptron Classifier
        Parameters:
            eta: float - Learning rate (0.0, 1.0) (side note: this is the greek letter eta. not ETA)
            n_interations: int - interations/passes over the training data set
            random_state: int - random number generator seed for random weight initialization

        Attributes/Members:
            w_fitted: 1d array - weights after fitting
            errors_: list - number of misclassifications (updates) in each epoch 
    """

    def __init__(self, eta=0.01, n_iterations=50, random_state=1):
        self.eta = eta
        self.n_interations = n_iterations
        self.random_state = random_state

    def fit(self, X, y):
        """
        Fit training data

        Parameters:
            X: {array like}, shape = [n_samples, n_features] - Training vectors with samples (number of entries; rows) and features (dimensions; columns)
            y: {array like}, shape = [n_samples] - target values 

        Returns: 
            self: object - returns a perceptron object
        """

        # randomly generated number using perceptron.randomstate as the seed
        rgen = np.random.RandomState(self.random_state)
        # fill weights array with random values normally distributed around 0.0 with standard deviation of 0.01. size = n_features + 1 (for the bias unit)
        self.w_fitted = rgen.normal(loc=0.0, scale=0.01, size=1 + X.shape[1])
        # weights can't be 0 because learning rate (eta) only has an effect on classification outcome if weights are non zero
        # if weights are 0 then eta only affects the scale of the weight vector and not the direction

        # create empty list for errors
        self.errors_ = []

        # for each entry between 0 and number of iterations
        for _ in range(self.n_interations):
            errors = 0  # set errors to 0 for that entry
            # for each xi and target in the tuple of X and Y
            for xi, target in zip(X, y):
                # set update variable to the eta * (target - predicted xi) predict is a function that defined below
                # update weight value is the learning rate * (y - y^hat 'predicated value')
                update = self.eta * (target - self.predict(xi))
                # NOTE: xi relates to the value in the X column of the tuple and target relates to the value in the y column of the tuple
                # starting after the bias unit, add fitted weights by adding (the update calculation * the sample value)
                # updated weight times the sample
                self.w_fitted[1:] += update * xi
                self.w_fitted[0] += update  # updated weight
                # number of errors during pass for the sample (???)
                errors += int(update != 0.0)
            self.errors_.append(errors)
        return self

    def net_input(self, X):
        # calculates net input
        # returns dot product of X and the fitted weight + the bias unit
        return np.dot(X, self.w_fitted[1:]) + self.w_fitted[0]

    def predict(self, X):
        # return class label after unit step
        return np.where(self.net_input(X) >= 0.0, 1, -1)


# Get values from iris data frame from rows 0-99 and from column 4
y = IrisDataframe.iloc[0:100, 4].values
# set the target value to 1 or negative 1 if it is setosa
y = np.where(y == 'Iris-setosa', -1, 1)
