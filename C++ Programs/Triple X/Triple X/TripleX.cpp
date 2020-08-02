#include "TripleX.h"
#include <iostream>

int AnswerSum;
int AnswerProduct;
int EnteredNumber;
int count = 0;


int main() {

	std::cout << "Solve the puzzle:" << std::endl;
	std::cout << "Enter the correct 3 number sequence to advance.";
	
	while (count < 3) {
		std::cin >> EnteredNumber;
		AnswerSum += EnteredNumber;
		AnswerProduct = AnswerProduct * EnteredNumber;
	}

	return 0;
}