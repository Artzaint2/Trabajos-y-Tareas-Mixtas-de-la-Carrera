//Realizar un programa en C++ que muestre si un número es par o impar

#include <iostream>

using namespace std;

int main ()

{
    
    int x;
    
    cout<< "ingresa un numero: ";
    
    cin>>x;
    
    if (x % 2 == 0)
    
    { cout<<"el numero es par."<<endl;  }
    
    else
    
    {  cout<<"el numero es impar."<<endl; }
    
    
    system("PAUSE");
    
    return 0;
    
}
