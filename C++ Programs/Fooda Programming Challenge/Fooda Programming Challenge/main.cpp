//
//  main.cpp
//  Fooda Programming Challenge
//
//  Created by Andrew Littleton on 2/2/20.
//  Copyright © 2020 Andrew Littleton. All rights reserved.
//

#include <iostream>
#include "TernaryTree.hpp"



int main(int argc, const char * argv[]) {
    std::cout << "Hello, World!\n";
    return 0;
    
    int treeToPass [10] = {9, 3, 4, 1, 6, 8, 9, 3, 4, 2};
    node treeToBuild [10];
    node newNode {10};
    
    TernaryTree::buildTree(treeToPass, treeToBuild);
    

};




