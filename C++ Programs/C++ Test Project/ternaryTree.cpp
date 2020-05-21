#include "ternaryTree.h"


class ternaryTree {


public:
    int size;
    int height;


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
    node* buildTree(int* arr) {
        node tree[sizeof(arr)] = {};
        node root;
        for (int i = 0; i < sizeof(arr); i++) {
            if (&tree[0] == nullptr) {
                root.value = arr[i];
                tree[i] = root;
            }

            if (root.leftChild == nullptr) {
                if (arr[i] < root.value) {
                    node node;
                    node.value = arr[i];
                    root.leftChild = &node;

                }
            }

            if (root.rightChild == nullptr) {
                if (arr[i] > root.value) {
                    node node;
                    node.value = arr[i];
                    root.rightChild = &node;
                }
            }
           
            if (arr[i] == root.value && &root != nullptr) {
                node node;
                node.value = arr[i];
                node.parent = &root;
            }

        }
        size = sizeof(tree);
        return tree;
    }

    void insert(int n) {
        node newNode{ n };
        //dynamic memory adjustment

        //add 
    };

    int remove() {
        return 0;
    };

    node getNode(int value, ternaryTree tree) {
        //for (int i = 0; i < tree)
    }
};

