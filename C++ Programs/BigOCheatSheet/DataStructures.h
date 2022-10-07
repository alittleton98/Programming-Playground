#pragma once
#include <chrono> // used for the maps with UIDs 

#define std:: _ // because it's annoying

// Data structure header file
// All data types will be int unless otherwise noted


class Stack 
{
	// Last in, First out
	int size;
	int* stack;
	bool bIsEmpty;

	void push(int valueToBeAdded);
	int pop();
	int search(int valueToBeFound);
	int access(int valueToBeAccessed);

};

class Queue 
{
	// First in, First out
};

class Single_LinkedList
{
	// Linked only to i+1
};

class Double_LinkedList
{
	// Linked to both i+1 and i-1
};

class SkipList
{
	// LinkedList with higher level lanes to each element organized over layers
};

class HashMap
{
	// structure where indices are unique rather than ordered
};

class BinaryTree
{
	// Node based data structure where each parent has at most two children (left is < and right is >)
	// use sorted tree verison
	
};