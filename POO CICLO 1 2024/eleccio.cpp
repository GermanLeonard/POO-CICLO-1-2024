#include <iostream>
using namespace std;

int main(){
    int pet,vas,tonya;
    int ejercicios;
    cin>>ejercicios;
    int contador=0;

   for (int i = 0; i < ejercicios; i++)
   {
   cin>>pet;
   cin>>vas;
   cin>>tonya;
   
   if (pet+vas+tonya>=2)
   {
    contador++;
   }
   
   }
   cout<<contador;
   
 return 0;

}