//Desarrolle un programa que lea un número por pantalla y diga si positivo o negativo

#include <iostream>

using namespace std;
int main (){
    int a;
    cout<<"por favor ingrese un numero."<<endl;
    cin>>a;
    if(a<0){
        cout<<"El numero ingresado es negativo."<<endl;
        
    }
        else{
            cout<<"El numero ingresado es positivo."<<endl;
        }   
        
        system("PAUSE");
        return 0;
    }
