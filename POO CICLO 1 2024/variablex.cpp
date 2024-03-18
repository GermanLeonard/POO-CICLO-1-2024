#include <iostream>
using namespace std;

int main()
{
    int x = 0;
    int operaciones;
    cin >> operaciones;
    string SUMAORESTA;

    for (int i = 0; i < operaciones; i++)
    {
        cin >> SUMAORESTA;
        if ((SUMAORESTA == "++X" || SUMAORESTA == "X++") || (SUMAORESTA == "++x" || SUMAORESTA == "x++"))
        {
            x = x + 1;
        }
        else if ((SUMAORESTA == "--X" || SUMAORESTA == "X--") || (SUMAORESTA == "--x" || SUMAORESTA == "x--"))
        {
            x = x - 1;
        }
    }

    cout << x;

    return 0;
}