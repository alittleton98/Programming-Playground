#include <stdlib.h>
#include <map>
#include <stdexcept>
#include <cstdlib>
#include <time.h>
#include <vector>
#include <string>
//Function Declarations for the problems
int FrequencyGame(int* A, int n);
int EggDroppingPuzzle(int N, int K);
std::vector<std::string> FullJustify(std::vector<std::string>& words, int maxWidth);

//Main execution
int main() {
	
	//Frequency Game
	//int FrequencyGameTestcase[10] = { 1,5,3,6,3,6,10,3,5,10 };
	//FrequencyGame(FrequencyGameTestcase, 10);
	//
	////Egg Dropping Puzzle
	//int NumberOfEggs = 5;
	//int NumberOfFloors = 12;
	//EggDroppingPuzzle(NumberOfEggs, NumberOfFloors);

	//Full Justification
	std::vector<std::string> words = { "This", "is", "a", "sentence", "that", "will", "need", "to", "be", "justified." };
	FullJustify(words, 10);

	return 0;
}

int FrequencyGame(int* A, int n) {
	int largestElement = 0;
	int largestElementFrequency = 0;

	//Key is element, Value is frequency
	std::map<int, int> FrequencyMap;
	//Put all elements of array in the map and update the frequency value if the key is present
	for (int i = 0; i < n; i++) {
		try {
			FrequencyMap.at(A[i])+= 1;
		}
		catch (const std::out_of_range oor) {
			FrequencyMap.insert(std::pair<int, int>(A[i], 1));
		}
	}
	//check for largest element and see if it's frequency is greater than 1
	for (int i = 0; i < n; i++) {
		if (A[i] > largestElement) {
			largestElement = A[i];
			largestElementFrequency = FrequencyMap.at(largestElement);
		}
	}
	//if greater than 1, check to see if the 
	if (largestElementFrequency > 1) {
		for (int i = 0; i < n; i++) {
			if (FrequencyMap.at(A[i] < largestElementFrequency)) {
				largestElement = A[i];
			}
		}
	}
	return largestElement;
}

int EggDroppingPuzzle(int N, int K) {
	int MinimumMoves = 0;
	int SafeFloorActual;
	int SafeFloorGuess;
	bool bIsEggBroken;
	int MinimumSafeFloor = 1;
	int MaximumSafeFloor = K;


	//random generation of safe floor
	srand(time(NULL));
	SafeFloorActual = rand() % K + 1;

	//Binary search
	//solving with a structure might be easier than doing it purely mathematically
	//set iterator to K/2
	//if FloorCheck is <= SafeFloor, bIsEggBroken = false
	//N-1
	//MinimumSafeFloor = K/2;
	//(k-minimumSafeFloor)/2 is new starting position
	//continue this process, until egg
	do {
		//Safe floor guess is bound by the adjusting window values
		SafeFloorGuess = (MaximumSafeFloor - MinimumSafeFloor) / 2;
		//if guess is less than actual, 
		if (SafeFloorGuess < SafeFloorActual) {
			bIsEggBroken = false;
			MinimumSafeFloor = SafeFloorGuess;
			N--;
		}
		if (SafeFloorGuess > SafeFloorActual) {
			bIsEggBroken = true;
			MaximumSafeFloor = SafeFloorGuess;
			N--;
		}
		else {
			continue;
		}
	} while (N > 0 || SafeFloorGuess != SafeFloorActual);


	return MinimumMoves;
}

std::vector<std::string> FullJustify(std::vector<std::string>& words, int maxWidth) {
	//create a new vector of strings that will represent each line
	std::vector<std::string> justified;
	std::string newString;
	for (std::string word : words) {
		
		//add words to strings in new vector with a space following each one
		//Check if the words addition will put the size of the string to be larger than maxWidth
		if (newString.size() < maxWidth) {
			newString.append(word + " ");
		}
		//if larger, push_back to vector and start a new string
		else {
			justified.push_back(newString);
			newString.clear();
			newString.append(word + " ");
		}
	} //add all words to vector first, then justify

	//to justify, traverse string and add 1 space for each space found until length == maxWidth
	//solution with bad time complexity O(n^2)
	for (std::string line : justified) {
		for (int i = 0; i < line.length(); i++) {
			if (line[line.length() - 1] == ' ') {
				line.pop_back();
			}
			while (line.length() < maxWidth) {
				if (line[i] == ' ') {
					line.insert(i, " ");
				}
				else {
					continue;
				}
			}
		}
	}

	//to justify, traverse string and add 1 space for each space found until length == maxWidth
	//remove trailing space first using pop_back

	return justified;
}