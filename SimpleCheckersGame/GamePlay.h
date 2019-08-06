#include <string>
using namespace std;

class GamePlay
{
public:
    static int turnCount, whitePieces, redPieces, totalPieces;
    static string player1Name, player2name;
    bool victory;

    int construct()
    {
        turnCount = 0;
        whitePieces = 16;
        redPieces = 16;
        totalPieces = whitePieces + redPieces;
        player1Name = "Player 1";
        player2name = " Player 2";
    }

    virtual void GenereateGame();
    virtual bool VictoryCheck();
};