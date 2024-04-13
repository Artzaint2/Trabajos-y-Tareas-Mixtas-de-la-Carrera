/* Dada una cadena fuente y una secuencia de caracteres guardados en un array, escribir un método que devuelva la posición 
de la primera ocurrencia de cualquiera de los caracteres del array cadena.*/

#include <iostream>
#include <conio.h>
#include <string.h>
using namespace std;
int main ()

{
 
 char palabra[100],nueva[100];
 
 //pedimos al usuario que ingrese una palabra
 
 cout<<"\n\tPor Favor, escriba una palabra/frase: ";
 cin.getline(palabra,100,'\n');
 
 //mostramos la nueva palabra
 
 strcpy(nueva,palabra);
 cout<<"\n\t"<<nueva<<endl;
 
 getch();
 
 system("PAUSE");
 return 0;
 
}
