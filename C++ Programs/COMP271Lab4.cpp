#include <iostream>
using namespace std;

int main()
{
    int largest = 0;
    int smallest = 1000;
    int enteredNum = 0;
    int count = 0;
    int sum = 0;
    double avg;

    do
    {
        cout << "Enter a positive number: ";
        cin >> enteredNum;
        if (enteredNum > largest)
        {
            largest = enteredNum;
        }
        if (enteredNum < smallest && enteredNum > 0)
        {
            smallest = enteredNum;
        }
        sum += enteredNum;
        count++;
    } while (enteredNum > 0);

    avg = sum / count;
    cout << "Largest: " << largest << endl;
    cout << "Smallest: " << smallest << endl;
    cout << "Average: " << avg << endl;

    return 0;
}