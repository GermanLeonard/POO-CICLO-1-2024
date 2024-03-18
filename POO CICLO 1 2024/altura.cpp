#include <iostream>
using namespace std;

int main()
{
    int atracciones;
    int altura;
    int alturasNecesarias[atracciones];
    int contador = 0;

    cout << "ingrese la cantidad de atracciones:";
    cin >> atracciones;

    cout << "altura: ";
    cin >> altura;

    for (int i = 0; i < atracciones; i++)
    {
        cout << "ingrese la altura de la atraccion " << i + 1;
        cin >> alturasNecesarias[i];

        if (altura >= alturasNecesarias[i])
        {
            contador = contador + 1;
        }
    }

   

    return 0;
}