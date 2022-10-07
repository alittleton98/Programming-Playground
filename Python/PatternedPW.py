# Python password generator. Returns a list of passwords of a certain length that all follow the same movement pattern on the keyboard
# Passwords of this nature meet many password complexity requirements without being difficult to remember due to muscle memory
import random

# Variables
OriginalPassword = ""
GeneratedPassword = ""
OriginalPasswordDict = {}
NewPasswordsList = []
NumberKeys = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0']
NumberRowSymbolKeys = ['!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_']
# Following lists also have the regular row (non-shift accessible) symbol keys
TopRowAlphaKeys = ['q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', '[', ']']
MiddleRowAlphaKeys = ['a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';']
BottomRowAlphaKeys = ['z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/']
CompleteKeyboard = []
CompleteKeyboard.append(MiddleRowAlphaKeys)
CompleteKeyboard.append(NumberRowSymbolKeys)
CompleteKeyboard.append(TopRowAlphaKeys)
CompleteKeyboard.append(BottomRowAlphaKeys)
CompleteKeyboard.append(NumberKeys)

# Check to see which characters are at the extremities
# Automatically meets the complexity requirements with a symbol, number, a capital letter, and is at least 8 characters long


def GenerateFreshPassword(PasswordLength):
    GeneratedPassword = random.choices(CompleteKeyboard, PasswordLength)
    return GeneratedPassword


def GeneratePasswordsNew(pCharacterCount):
    GeneratedPassword = GenerateFreshPassword(pCharacterCount)
    NewPasswordsList.append(GeneratedPassword)
    CharLeftExtremeIndex = -1

    return


def GeneratePasswordsFromOld(pOriginalPassword):
    return
