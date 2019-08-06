#include "GamePlay.h"
#include "MapBuilder.h"
#include <array>
#include <iostream>

using namespace std;

class GameEngine
{
public:
    void buildMap(const int xTiles, const int yTiles)
    {

        GamePieces gameboard[xTiles][yTiles];
        int size = sizeof(gameboard);
        for (int i = 0; i < GamePlay::totalPieces / 2; i++)
        {
            GamePieces whitePiece = GamePieces("White");
        }

        for (int j = size; j > GamePlay::totalPieces / 2; j--)
        {
            GamePieces redPieces = GamePieces("Red");
        }
    }

    bool canMapBuild(int totalPieces, int totalTiles)
    {
        if (totalTiles == totalPieces * 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    bool victoryCheck()
    {
        if (GamePlay::whitePieces == 0)
        {
            cout << "RED IS THE WINNER";
        }
        if (GamePlay::whitePieces == 0)
        {
            cout << "WHITE IS THE WINNER";
        }
    }

    void GenereateGame()
    {
        if (MapBuilder::canMapBuild(GamePlay::totalPieces, MapBuilder::totalTiles))
        {
            MapBuilder::buildMap(MapBuilder::xTiles, MapBuilder::yTiles);
        }
    }
};