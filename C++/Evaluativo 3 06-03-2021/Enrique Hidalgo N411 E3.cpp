/* Escribe un programa que lea por pantalla un vector de numeros y muestre en la salida 
  los numeros del vector con sus indices asociados. */

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[100],n;
	
	//Primero se coloca la cantidad de valores
	
	cout<<"Colocar la cantidad de valores del arreglo: ";
	cin>>n;
	
	for(int i=0; i<n; i++){
		cout<<"Escriba un numero: ";
		cin>>numeros[i];
	}
	
	//Luego de eso, se muestran los elementos con sus indices asociados.
	
	for(int i=0; i<n; i++){
		cout<<i<<" -> "<<numeros[i]<<endl;
	}
	
	cout<<"Presione la tecla ´Enter´ para finalizar el programa.";
	
	getch();
	
	system("PAUSE");
	return 0;
}
