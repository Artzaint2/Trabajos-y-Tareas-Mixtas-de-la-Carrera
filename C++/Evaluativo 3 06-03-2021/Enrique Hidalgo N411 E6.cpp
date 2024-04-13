/* Desarrolle un programa que pida al usuario los datos de dos matrices de 3x3 y luego 
  muestre la suma de ellas. */

#include <iostream>
using namespace std;
 
int main() 
{      
    float vector1[3];
    float vector2[3];
    float vector3[3];
    float vectorSuma[3];
    int i;
 
    // se pide la informacion del primer vector.
    for (i=0; i<3; i++){
    	
        cout << "Introduce la componente " << i 
            << " del primer vector: ";
        cin >> vector1[i];
    }
 
    // Se pide la informacion del segundo vector.
    for (i=0; i<3; i++){
    	
        cout << "Introduce la componente " << i 
            << " del segundo vector: ";
        cin >> vector2[i];
    }
    
    // Se pide la informacion del tercer vector.
    for (i=0; i<3; i++){
    	
        cout << "Introduce la componente " << i 
            << " del tercer vector: ";
        cin >> vector2[i];
    }
 
    // Se calcula la suma.
    for (i=0; i<3; i++)
        vectorSuma[i] = vector1[i] + vector2[i] + vector3[i];
 
    // Finalmente mostramos el resultado.
    cout << "El vector suma es ";
    for (i=0; i<3; i++)
        cout << vectorSuma[i] << " ";
 
    system("PAUSE");
    return 0;
}
