/*Escribir un programa que reciba como parámetros 2 cadenas
de caracteres y determine si son iguales o si son diferentes y cual es la mayor.*/

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main(){
 
 char cadena1[100]; 
 char cadena2[100];
 
 //pedimos al usuario que ingrese dos palabras
 
 cout<<"\nEscriba una palabra: ";
 cin.getline(cadena1,100,'\n');
 
 cout<<"\nEscriba otra palabra: ";
 cin.getline(cadena2,100,'\n');
 
 if(strcmp(cadena1,cadena2)==0)
 {
 	
 	//si son iguales se le mostrara:
 	
  cout<<"Ambas palabras son iguales.";
  
 }
 
 //si son diferentes le mostrara:
 
 else if(strcmp(cadena1,cadena2)>0)
 {
 	
  cout<<"La palabra "<<cadena1<<" es mayor que: "<<cadena2<<endl;
 }
 
 else if(strcmp(cadena1,cadena2)<0)
 {
 	
  cout<<"La palabra "<<cadena2<<" es mayor que: "<<cadena1<<endl;
  
 }
 
 getch();
 
 
 system("PAUSE");
 return 0;
 
}
