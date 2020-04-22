#include "ternaryTree.h"


class ternaryTree {


public:


    //constructor
    ternaryTree(int* arr) {
        buildTree(arr);
    }

    /*
    builds ternary tree from int array
    why does it need the node array?
    This whole function doesn't make sense

    void ternaryTree::buildTree(int* arr, node* nArr) {
        int ternary;

        for (int i{ 0 }; i < sizeof(arr); ++i) {
            nArr[i].value = arr[i];
        }

        for (int j{ 0 }; j < sizeof(nArr); ++j) {
            ternary = j + 3;
            if (ternary > sizeof(nArr)) {
                ternary = ternary - sizeof(nArr);
            }
            else {
                for (int h{ ternary }; h > j; --h) {

                }
            }

        }
    };
    */
    //buildTree method V2
    void static buildTree(int* arr) {
        node nodeArray[sizeof(arr)] = {};
        for (int i = 0; i < sizeof(arr); i++) {
           //each middle node iterating by 3 starting at position 0
        }
        for (int i = 0; i < sizeof(arr); i++) {
            //each left node iterating by 3 starting at position 1
        }
        for (int i = 0; i < sizeof(arr); i++) {
            //each right node iterating by 3 starting at position 2
        }
    }

    void insert(int n) {
        node newNode{ n };
        //dynamic memory adjustment
        //add 
    };

    int remove() {
        return 0;
    };

    node getNode(int value) {

    }
};

