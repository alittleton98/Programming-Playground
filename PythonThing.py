# PythonThing

import random


def randomSum():
    randomNum = 0
    generatedNum = 0

    for x in range(3):
        generatedNum = random.randint(1, 10)
        randomNum += generatedNum
        print("The number is", generatedNum)

    print(randomNum)
    if randomNum >= 25:
        print("The sum is large")
    elif randomNum <= 5:
        print("The sum is small")
    else:
        print("The sum is average")


randomSum()
