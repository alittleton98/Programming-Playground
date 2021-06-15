# Load Libraries
import numpy
import pandas
from sklearn.svm import SVC
from sklearn.naive_bayes import GaussianNB
from sklearn.discriminant_analysis import LinearDiscriminantAnalysis
from sklearn.neighbors import KNeighborsClassifier
from sklearn.tree import DecisionTreeClassifier
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score
from sklearn.metrics import confusion_matrix
from sklearn.metrics import classification_report
from sklearn.model_selection import StratifiedKFold
from sklearn.model_selection import cross_val_score
from sklearn.model_selection import train_test_split
from matplotlib import pyplot
from pandas.plotting import scatter_matrix
from pandas import read_csv
from numpy import array
import csv


# Load dataset
# Access iris
iris = "Dataset\iris.csv"
# Column Names
names = ['sepal-length', 'sepal-width', 'petal-length', 'petal-width', 'class']
# Read the file
dataset = read_csv(iris, names=names)


# Shape of Dataset (Entries/Instances, Columns/Attributes)
print(dataset.shape)

# Head
print(dataset.head(20))

# Descriptions
print(dataset.describe())

# Class Distribution
print(dataset.groupby('class').size())

# NumPy Slicing Test
# For the sake of me learning it. Does not actually apply to the ML program
SlicingTestData1D = [11, 22, 33, 44, 55, 66, 77, 88, 99, 00]  # list of data
print(SlicingTestData1D)
print(type(SlicingTestData1D))
# convert list of data to np array. comma delineated
SlicingTestData1D = array(SlicingTestData1D)
print(SlicingTestData1D)
print(type(SlicingTestData1D))
print(SlicingTestData1D[0])  # indexing the first element from the front
print(SlicingTestData1D[5])  # indexing the 6th element from the front
print(SlicingTestData1D[-1])  # indexing the first element from the back (last)
print(SlicingTestData1D[-7])  # indexing the 7th element from the back (fourth)

SlicingTestData2D = [
    [11, 22, 33],
    [44, 55, 66],
    [77, 88, 99]]  # multi dimensional list of data

print(SlicingTestData2D)
print(type(SlicingTestData2D))
# convert list of data to np array. comma delineated
SlicingTestData2D = array(SlicingTestData2D)
print(SlicingTestData2D)
print(type(SlicingTestData2D))
# indexing the first row in the first column from the front
print(SlicingTestData2D[0, 0])
# indexing the third row in the third column from the front
print(SlicingTestData2D[2, 2])
# indexing the first row from the bottom (last) and the second column from the front
print(SlicingTestData2D[-1, 1])
print(SlicingTestData2D[-2, ])  # indexing the second row from the bottom

print(SlicingTestData1D[:])  # prints the whole data set
# prints the whole data set (all rows, all columns)
print(SlicingTestData2D[:, :])

# prints data starting 3 elements from the back to the end (only moves in positive direction)
print(SlicingTestData1D[-3:])
# prints all rows before row 2 (0 offset) and all columns starting at the second from the back -> forward
print(SlicingTestData2D[:2, -2:])
# testX is all rows but only the 2nd column. testY is all columns but only the 3rd row
testX, testY = SlicingTestData2D[:, 1], SlicingTestData2D[2, :]
print(testX)
print(testY)

# Split dataset for validation test
array = dataset.values
x = array[:, 0:4]  # Take all rows and the first 4 columns
y = array[:, 4]  # take all rows and only the 5th column
X_Train, X_Validation, Y_Train, Y_Validatation = train_test_split(
    x, y, test_size=0.2, random_state=1)

# Testing Harness
""" 
We will use stratified 10-fold cross validation to estimate model accuracy.
This will split our dataset into 10 parts, train on 9 and test on 1 and repeat for all combinations of train-test splits.
Stratified means that each fold or split of the dataset will aim to have the same distribution of example by class as exist in the whole training dataset.
We set the random seed via the random_state argument to a fixed number to ensure that each algorithm is evaluated on the same splits of the training dataset.
We are using the metric of ‘accuracy‘ to evaluate models.
This is a ratio of the number of correctly predicted instances divided by the total number of instances in the dataset multiplied by 100 to give a percentage(e.g. 95 % accurate).
We will be using the scoring variable when we run build and evaluate each model next.
 """
# Spot Check Algorithms
# Research these algorithms
models = []
models.append(('LR', LogisticRegression(
    solver='liblinear', multi_class='ovr')))
models.append(('LDA', LinearDiscriminantAnalysis()))
models.append(('KNN', KNeighborsClassifier()))
models.append(('CART', DecisionTreeClassifier()))
models.append(('NB', GaussianNB()))
models.append(('SVM', SVC(gamma='auto')))
# evaluate each model in turn
results = []
names = []
for name, model in models:
    kfold = StratifiedKFold(n_splits=10, random_state=1, shuffle=True)
    cv_results = cross_val_score(
        model, X_Train, Y_Train, cv=kfold, scoring='accuracy')
    results.append(cv_results)
    names.append(name)
    print('%s: %f (%f)' % (name, cv_results.mean(), cv_results.std()))

# Compare Algorithms
# Statistical comparison to be done in R. Following line outputs the file to be read
numpy.savetxt("pythonalgorithmresults.csv", numpy.column_stack((names, results)),
              delimiter=",", fmt='%s')
# Plot comparison
pyplot.boxplot(results, labels=names)
pyplot.title('Algorithm Comparison')
pyplot.show()
