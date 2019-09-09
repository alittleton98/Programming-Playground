# Homework 1
# Andrew Littleton
# 9/7/19
# COMP 379

import numpy as np
import sys

titanicData = np.genfromtxt(
    "SchoolDev/Machine Learning COMP 379/Homework 1/trainAdjusted.csv",
    delimiter=",",
    skip_header=1,
)
survivalLikelyhood = 100

# Calculates total survival percentage
def survivalPercentageCalculation():
    survivalNum = 0
    for x in titanicData[:, 3]:
        if x == 1:
            survivalNum += 1
    percentage = (survivalNum / np.ma.size(titanicData, 0)) * 100
    print(percentage)


def survivalVariablePercentage(variable, variableColumn):
    numOfSurvived = 0
    for x in titanicData[:, variableColumn]:
        if x == variable:
            if titanicData[:, 2] == 1:
                numOfSurvived += 1
    percentage = (numOfSurvived / np.ma.size(titanicData, 0)) * 100
    print(percentage)
    return percentage


def determineSurvivalScore(row):
    survivalScore = 100
    for x in titanicData[row, range(0, 2)]:
        intermediate = survivalVariablePercentage(titanicData[row, x], x)
        deduction = 100 - intermediate
        survivalScore -= deduction
    return survivalScore


def predictSurvial(passengerNumber):
    passengerNumber += 1
    return determineSurvivalScore(passengerNumber)


survivalPercentageCalculation()

