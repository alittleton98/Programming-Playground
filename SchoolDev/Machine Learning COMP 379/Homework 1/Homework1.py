# Homework 1
# Andrew Littleton
# 9/7/19
# COMP 379

import numpy as np  # import numpy under alias np
import sys  # import system

# Import statement for the data set to generate a 2D numpy array
titanicData = np.genfromtxt(
    "SchoolDev/Machine Learning COMP 379/Homework 1/trainAdjusted.csv",
    delimiter=",",
    skip_header=1,
)

# Calculates percentage of passengers that survived in total
def survivalPercentageCalculation():
    survivalNum = 0
    for x in titanicData[:, 3]:  # steps through all rows in column 3
        if x == 1:  # true if passenger survived
            survivalNum += 1  # survival count increases
    percentage = (
        survivalNum / np.ma.size(titanicData, 0)
    ) * 100  # percentage calculation based on total row number
    print(percentage)


# Calculates the percentage of passengers that survived based on a given value within a survival variable (column)
def survivalVariablePercentage(
    variable, variableColumn
):  # receives the value of the variable and the column the variable belongs to
    numOfSurvived = 0
    for x in titanicData[
        :, variableColumn
    ]:  # steps through every row of variable column
        if (
            x == variable
        ):  # true if element is equal to the value passed to the function
            if (
                titanicData[:, 2] == 1
            ):  # PROBLEM: logic is supposed to check for equality, but numpy arrays do not pass the element for equality so logic breaks.
                numOfSurvived += 1  # does not follow because of previous line's problem
    percentage = (
        numOfSurvived / np.ma.size(titanicData, 0)
    ) * 100  # percentage calculation
    print(percentage)
    return percentage


# Calcualtes the survival score of any given passenger based on the unique values within their row for each variable
def determineSurvivalScore(row):  # passed the passengerNumber -1 for the row number
    survivalScore = 100  # inital survival score
    for x in titanicData[
        row, range(0, 2)
    ]:  # for column between 0 and 2 in the row passed to the function
        intermediate = survivalVariablePercentage(
            titanicData[row, x], x
        )  # intermediate calcualtion for calcualting the percentage of people that survived within the given variable shared by the passengerNumber in question
        deduction = (
            100 - intermediate
        )  # deduction value is 100 - %of survived (ex. Class 1  = 90% survival. deduction value is 10 )
        survivalScore -= (
            deduction
        )  # survival score lowers by deduction value to determine survivalScore (ex. survialScore - 10 = 90 leading to high likely hood for survival)
    return survivalScore


# wrapping function that cleans up the other functions
def predictSurvial(passengerNumber):
    return determineSurvivalScore(passengerNumber - 1)


survivalPercentageCalculation()
