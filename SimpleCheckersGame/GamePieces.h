#include <string>
using namespace std;

class GamePieces
{
public:
    string color;
    bool alive;

    GamePieces(string c)
    {
        color = c;
        alive = true;
    }

    GamePieces()
    {
        color = "";
        alive = false;
    }
};