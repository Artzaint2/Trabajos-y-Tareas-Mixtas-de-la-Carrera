/* Escribe un programa que lea por pantalla un vector de numeros y muestre en la salida 
  los numeros del vector en orden inverso - del ultimo al primer elemento. */

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[100],n;
	
	//Primero colocamos la cantidad de los valores
	
	cout<<"Colocar la cantidad de valores del arreglo: ";
	cin>>n;
	
	for(int i=0; i<n; i++){
		cout<<"Escriba un numero: ";
		cin>>numeros[i];
	}
	
	//Ahora se mostraran los elementos y sus indices asociados.
	
	for(int i=0; i<n; i++){
		cout<<i<<" -> "<<numeros[i]<<endl;
	}
	
//Ahora se le dara a los valores de forma intensa

for(int i=0; i<n; i++){
cout<<"los numeros ivertidos seran:";
}
 
for(int i=0; i<n; i++){
cout<<""<<i; 
}

getch();

system("PAUSE");
return 0;
 
}
