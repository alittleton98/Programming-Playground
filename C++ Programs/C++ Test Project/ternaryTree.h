#pragma once
struct node {
    int value;
    node* leftChild;
    node* rightChild;
    node* middleChild;
    node* parent = nullptr;
};
class ternaryTree
{

    public:
        node static createNode(int);
        node* static buildTree(int[]);
        node static getNode(int nodeValue);
        //void static determineNodeType(node*);
        void static insert(node);
        int  static remove();

};



