import numpy as np
import pandas as pd
import matplotlib.pyplot as plot
from matplotlib.colors import ListedColormap


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


def plot_decision_regions(X, y, classifier, resolution=0.02):

    # setup marker generator and color map
    markers = ('s', 'x', 'o', '^', 'v')
    colors = ('red', 'blue', 'lightgreen', 'gray', 'cyan')
    cmap = ListedColormap(colors[:len(np.unique(y))])

    # plot the decision surface
    x1_min, x1_max = X[:, 0].min() - 1, X[:, 0].max() + 1
    x2_min, x2_max = X[:, 1].min() - 1, X[:, 1].max() + 1
    xx1, xx2 = np.meshgrid(np.arange(x1_min, x1_max, resolution),
                           np.arange(x2_min, x2_max, resolution))
    Z = classifier.predict(np.array([xx1.ravel(), xx2.ravel()]).T)
    Z = Z.reshape(xx1.shape)
    plot.contourf(xx1, xx2, Z, alpha=0.3, cmap=cmap)
    plot.xlim(xx1.min(), xx1.max())
    plot.ylim(xx2.min(), xx2.max())

    # plot class samples
    for idx, cl in enumerate(np.unique(y)):
        plot.scatter(x=X[y == cl, 0],
                     y=X[y == cl, 1],
                     alpha=0.8,
                     c=colors[idx],
                     marker=markers[idx],
                     label=cl,
                     edgecolor='black')


# Get values from iris data frame from rows 0-100 and from column 4
# gets the setosa and the versicolor iris samples (setosa belongs to rows 0-51, versicolor belongs to the remaining rows)
y = IrisDataframe.iloc[0:100, 4].values
# set the target value to 1 or negative 1 if it is setosa
y = np.where(y == 'Iris-setosa', -1, 1)

# Extract sepal length and petal length (rows 0-100 and columns 0 and 2)
X = IrisDataframe.iloc[0:100, [0, 2]].values
print(X)
# plot data
# plots the first fifty rows in each column with
plot.scatter(X[:50, 0], X[:50, 1],
             color='red', marker='o', label='Setosa')
# plots the remaining rows
plot.scatter(X[50:100, 0], X[50:100, 1],
             color='blue', marker='x', label='versicolor')

plot.xlabel('sepal length [cm]')
plot.ylabel('petal length [cm]')
plot.legend(loc='upper left')

plot.savefig('Iris_SetosaVersicolor_SepalPetal_Scatter', dpi=300)
plot.show()

# Train perceptron model
# create perceptron object with learning rate (eta) of 0.1 that will iterate over the set 10 times
IrisPtron = Perceptron(eta=0.1, n_iterations=10)
# fit the samples against the target values
IrisPtron.fit(X, y)

# plot the model
# plot the errors
plot.plot(range(1, len(IrisPtron.errors_) + 1), IrisPtron.errors_, marker='o')
plot.xlabel('Epochs')
plot.ylabel('Number of Updates')
plot.savefig('MisclassificationErrors vs Epochs.png', dpi=300)
plot.show()

# plot decision regions on original graph
plot_decision_regions(X, y, classifier=IrisPtron)
plot.xlabel('sepal length [cm]')
plot.ylabel('petal length [cm]')
plot.legend(loc='upper left')


plot.savefig(
    'Iris_SetosaVersicolorDescisionRegions_SepalPetal_Scatter', dpi=300)
plot.show()
