//#include "TripleX.h"
#include <iostream>

int* NumberGenerator(int difficulty) {
	int solutionArr[5];
	int SolutionSum = 0;
	int SolutionProduct = 1;

	for (int i = 0; i < 3; i++) {
		solutionArr[i] = rand() % difficulty + 1;
		std::cout << solutionArr[i];
	}

	for (int i = 0; i < 3; i++) {
		SolutionSum += solutionArr[i];
		SolutionProduct = SolutionProduct * solutionArr[i];
	}
	std::cout << SolutionSum;
	std::cout << SolutionProduct;
	solutionArr[3] = SolutionSum;
	solutionArr[4] = SolutionProduct;

	return solutionArr;
}

bool DidPlayerWin(int sum, int product, int* NumArray, int SolutionSum, int SolutionProduct) {
	

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
		
		std::cout << "Enter 3 numbers to solve the puzzle" << std::endl;
		std::cout << "The numbers should sum to " << &NumArray[4] << " and their product should be " << &NumArray[5] << std::endl;

		do {

			while (Count < 3) {
				std::cin >> EnteredNumber;
				PlayerAnswerSum += EnteredNumber;
				PlayerAnswerProduct = PlayerAnswerProduct * EnteredNumber;
				Count++;
			}

			std::cout << PlayerAnswerSum << std::endl;
			std::cout << PlayerAnswerProduct << std::endl;
		} while (!DidPlayerWin(PlayerAnswerSum, PlayerAnswerProduct, NumArray, NumArray[4], NumArray[5]));

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
	
	std::cout << "Press any key to begin" << std::endl;
	getchar();
	
	
	GameOperator();

	return 0;
}


