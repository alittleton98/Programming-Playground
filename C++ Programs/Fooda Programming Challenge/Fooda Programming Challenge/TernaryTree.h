//
//  TernaryTree.h
//  Fooda Programming Challenge
//
//  Created by Andrew Littleton on 2/3/20.
//  Copyright © 2020 Andrew Littleton. All rights reserved.
//

#ifndef TernaryTree_h
#define TernaryTree_h

class TrinaryTree{
    struct node{
        int value;
        int *leftChild;
        int *rightChild;
        int *parent = NULL;
    };
public:
    void buildTree(int[]);
    void insert(node);
    int remove ();
};

#endif /* TernaryTree_h */
