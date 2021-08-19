#include <stdlib.h>
#include <map>
#include <stdexcept>

//Function Declarations for the problems
int FrequencyGame(int* A, int n);
int EggDroppingPuzzle(int N, int K);

//Main execution
int main() {
	
	//Frequency Game
	int FrequencyGameTestcase[10] = { 1,5,3,6,3,6,10,3,5,10 };
	FrequencyGame(FrequencyGameTestcase, 10);
	
	//Egg Dropping Puzzle
	int NumberOfEggs = 5;
	int NumberOfFloors = 12;




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
	int SafeFloor;

	return MinimumMoves;
}