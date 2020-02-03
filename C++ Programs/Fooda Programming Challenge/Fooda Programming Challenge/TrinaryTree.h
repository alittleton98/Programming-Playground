//
//  TrinaryTree.h
//  Fooda Programming Challenge
//
//  Created by Andrew Littleton on 2/2/20.
//  Copyright © 2020 Andrew Littleton. All rights reserved.
//

#ifndef TrinaryTree_h
#define TrinaryTree_h

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

#endif /* TrinaryTree_h */
