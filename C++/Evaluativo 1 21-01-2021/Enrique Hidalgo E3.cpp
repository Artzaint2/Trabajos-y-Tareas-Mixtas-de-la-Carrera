//Desarrollar un programa que determine el mayor de 3 números introducidos en pantalla y la sumatorio de todos ellos

#include <iostream>

using namespace std;

int num1, num2, num3;

int main() {
        cout << "Por favor ingrese 3 numeros: \n";
        cout << "Valor N#1: ";
    cin >> num1; "\n";
        cout << "Valor N#2: ";
    cin >> num2; "\n";
        cout << "Valor N#3: ";
    cin >> num3; "\n";
        cout << "Los numeros ingresados fueron: " << num1 << " , " << num2 << " y " << num3 << "\n";
    
   if (num1 > num2 && num1 > num3) {
        cout << num1 << " Es mayor que los otros numeros ingresados" << "\n";
   } else if (num2 > num1 && num2 > num3) {
            cout << num2 << " Es mayor que los otros numeros ingresados" << "\n";
   } else {
        cout << num3 << " Es mayor que los otros numeros ingresados" << "\n";
   }        
    
    int sum = num1 + num2 + num3;
        cout << "La suma de los numeros ingresados tiene como resultado: " << sum << endl;
        
        cout << "---------------------------------------------------------------------" << endl;
        
    system("PAUSE");    
    
        return 0;
        
}
  
 
 
