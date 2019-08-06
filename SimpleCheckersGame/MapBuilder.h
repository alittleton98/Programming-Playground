#include "GamePieces.h"
using namespace std;

class MapBuilder
{
public:
    static const int xTiles, yTiles, totalTiles;
    static bool didMapBuild;

    int construct()
    {
        int xTiles = 8;
        int yTiles = 8;
        int totalTiles = xTiles * yTiles;
    }

    static bool canMapBuild(int totalPieces, int totalTiles);
    static void buildMap(const int xTiles, const int yTiles)
    {
        GamePieces gameboard[xTiles][yTiles];
    }
};