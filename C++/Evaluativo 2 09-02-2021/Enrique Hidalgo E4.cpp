/* Utilizando el while crear un programa que pida al usuario su contrase�a numerica.
  debera terminar cuando introduzca como contrase�a el numero 4567, El programa debe de ser capaz de pedir la contrase�a tantas veces como sea necesario.
*/
#include <iostream>
using namespace std;
 
int main()
{
    int valida = 4567;
    int clave;
 
    do
    {
        cout << "Por favor ingrese la clave secreta: ";
        cin >> clave;
        if (clave != valida) 
            cout << "Clave errada, por favor intente de nuevo." << endl;
            
    
    }
    while (clave != valida);

    cout << "Verificando..." <<endl;
    system("PAUSE");
    cout << "Acceso concedido, bienvenido Usuario." << endl;
    
    system("PAUSE");
    return 0;
}
