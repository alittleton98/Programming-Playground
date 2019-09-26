#include <iostream>
using namespace std;

int main(int argc, const char *argv[])
{
    string name;
    string music;

    cout << "HELLO WORLD!" << endl;
    cout << "What's your name? ";
    cin >> name;
    cout << "Hello " + name + "!" << endl;
    cout << "What's your favorite kind of music? ";
    cin >> music;
    cout << "Wow that's so cool! I have to go now. Run me again to have another conversation. BYE!" << endl;

    return 0;
}
