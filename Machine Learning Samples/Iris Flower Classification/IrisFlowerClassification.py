# Load Libraries
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
