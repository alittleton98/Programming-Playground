//
//  TernaryTree.h
//  Fooda Programming Challenge
//
//  Created by Andrew Littleton on 2/3/20.
//  Copyright © 2020 Andrew Littleton. All rights reserved.
//

#ifndef TernaryTree_h
#define TernaryTree_h


    struct node{
        int value;
        node *leftChild;
        node *rightChild;
        node *middleChild;
        node *parent = NULL;
    };

class TernaryTree{
public:
    node static createNode(int);
    void static buildTree(int[], node[]);
    void static determineNodeType(node*, node*);
    void static insert(node);
    int static remove ();
    
};

#endif /* TernaryTree_h */
