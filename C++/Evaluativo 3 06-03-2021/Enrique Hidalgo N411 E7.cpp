/* Desarrollar un programa que pida al usuario que rellene una matriz de mxn y luego muestre
  la diagonal inversa de la matriz. */

#include<iostream>
#include<conio.h>

using namespace std;

int main(){
	int numeros[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
	
	cout<<"Matriz Completa.\n";
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			cout<<numeros[i][j];
		}
		cout<<"\n";
	}
	
	cout<<"\n\nSe muestra la diagonal de la matriz.\n";
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			if(i==j){
				cout<<numeros[i][j]<<endl;
			}
		}
	}
	
	getch();
	
	system("PAUSE");
	return 0;
}
