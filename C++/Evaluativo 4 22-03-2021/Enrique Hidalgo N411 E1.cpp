/*El siguiente programa (proyecto Division) lee dos valores y calcula el cociente entre ambos. 
Si el divisor es cero, se intenta realizar una división por cero y el programa lanza una 
excepción de división por cero (EZeroDivide).*/

#include <iostream>
using namespace std;
int main()
{
try
{      
    int a,b;
    cout<<"Por favor, ingrese valores para a y b"<<endl;
    cin>>a>>b;
    if(b!=0)
        cout<<"El resultado que obtenemos es: "<<(a/b)<<endl;
    else
        throw(b);
    }
    catch(int c)
    {
        cout<<"Excepcion tomada : Dividir por: "<<+c;
    }
    system("PAUSE");
    return 0;
}
