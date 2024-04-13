/* Desarrolle un programa que lea por pantalla un vector de numeros enteros 
  y determine el mayor elemento del vector. */

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[100],n,mayor=0;
	
	//Primero ingresaremos la cantidad de valores del areglo
	
	cout<<"Introduzca la cantidad de valores del arreglo: ";
	cin>>n;
	
	//Ahora, se muestran los valores
	
	for(int i=0; i<n; i++){
		cout<<i+1<<". Ingrese un numero: ";
		cin>>numeros[i];
		
		//Con esto se detectara el numero mayor del arreglo.
		
		if(numeros[i] > mayor){
			mayor = numeros[i];
		}
	}
	
	cout<<"\nEl numero mayor del arreglo es "<<mayor<<endl;
	
	getch();
	
	system("PAUSE");
	return 0;
}
