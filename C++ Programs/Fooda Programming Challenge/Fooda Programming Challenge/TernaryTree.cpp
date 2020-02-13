//
//  TernaryTree.cpp
//  Fooda Programming Challenge
//
//  Created by Andrew Littleton on 2/3/20.
//  Copyright © 2020 Andrew Littleton. All rights reserved.
//

#include "TernaryTree.hpp"

void TernaryTree::buildTree(int *arr, node *nArr){
    int ternary;

    
    
    for (int i {0}; i < sizeof(arr); ++i){
        nArr[i].value = arr[i];
    }
    
    for (int j {0}; j < sizeof(nArr); ++j){
        ternary = j+3;
        if (ternary > sizeof(nArr)){
            ternary = ternary - sizeof(nArr);
        }
        else{
            for (int h{ternary}; h > j; --h){
                
            }
        }
        
    }
};

node TernaryTree::createNode(<#int#> n){
    node newNode {n};
    return newNode;
}



void TernaryTree::determineNodeType(node *a, node *b){
    if (b -> value < a -> value){
        
    }
}



void TernaryTree::insert (node n){
    
};

int TernaryTree::remove(){
    return 0;
};
