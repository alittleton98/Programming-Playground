//#include "TripleX.h"
#include <iostream>

int* NumberGenerator(int difficulty) {
	int solutionArr[3];

	for (int i = 0; i < sizeof(solutionArr); i++) {
		solutionArr[i] = rand() % difficulty + 1;
	}

	return solutionArr;
}

bool DidPlayerWin(int sum, int product, int* NumArray) {
	
	int SolutionSum = 0;
	int SolutionProduct = 1;
	for (int i = 0; i < sizeof(NumArray); i++) {
		SolutionSum += NumArray[i];
		SolutionProduct = SolutionProduct * NumArray[i];
	}

	if (sum == SolutionSum && product == SolutionProduct) {
		return true;
	}
	else {
		return false;
	}
}

void GameOperator() {
	int difficulty = 1;
	int PlayerAnswerSum = 0;
	int PlayerAnswerProduct = 1;
	int EnteredNumber;
	int Count = 0;
	bool PlayAgain = true;
	char PlayAgainInput;
	int* NumArray = NumberGenerator(difficulty);

	do {
		

		do {

			while (Count < 3) {
				std::cin >> EnteredNumber;
				PlayerAnswerSum += EnteredNumber;
				PlayerAnswerProduct = PlayerAnswerProduct * EnteredNumber;
				Count++;
			}

			std::cout << PlayerAnswerSum << std::endl;
			std::cout << PlayerAnswerProduct << std::endl;
		} while (!DidPlayerWin(PlayerAnswerSum, PlayerAnswerProduct, NumArray));

		std::cout << "Press Y to play again ";
		std::cin >> PlayAgainInput;
		if (PlayAgainInput == 'Y') {
			continue;
			difficulty++;
		}
		else {
			PlayAgain = false;
		}
	} while (PlayAgain);
	
}

int main() {
	/*
	std::cout << "Press any key to begin" << std::endl;
	getchar();
	*/
	
	GameOperator();

	return 0;
}


