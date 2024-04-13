/* Escribe un programa que defina un vector de numeros  calcule la suma de sus elementos.*/


#include <iostream>
using namespace std;
 
int main() 
{      
    float vector1[3];
    float vector2[3];
    float vectorSuma[3];
    int i;
 
    // Pedimos los datos del Vector #1
    for (i=0; i<3; i++){
    	
        cout << "Ingrese el componente " << i 
            << " del Vector #1: ";
        cin >> vector1[i];
    }
 
    // Pedimos los datos del Vector #2
    for (i=0; i<3; i++){
    	
        cout << "Ingrese el componente " << i 
            << " del vector #2: ";
        cin >> vector2[i];
    }
    
    // Se calcula la suma de ambos
    for (i=0; i<3; i++)
        vectorSuma[i] = vector1[i] + vector2[i];
 
    // finalmente se muestra el resultado
    cout << "El vector sumado es ";
    for (i=0; i<3; i++)
        cout << vectorSuma[i] << " ";
 
    
    system("PAUSE");
    return 0;
}
