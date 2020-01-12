#include <iostream>
#include "atom.h"
using namespace std;

int main()
{
    atom Hydrogen;
    atom Iron(26,26,26);
    atom HydrogenCopy(Hydrogen);
    atom Helium = Hydrogen.fusion(HydrogenCopy);

}