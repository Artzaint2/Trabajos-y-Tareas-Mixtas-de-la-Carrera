/* Desarolle un programa que realice las funciones indicadas por el profesor.*/

#include <stdio.h>
#include <windows.h>


void Pares_Impares();
int Perfecto(int n);
void Numero_Perfecto();
void Inverso();
void Tiempo();
int main()

//Menu de opciones.

{
	
 int opcion;
 printf("=Bienvenido!=\n");
 printf("Menu Principal \n");
 printf("\n 1.- Pares e Impares ");
 printf("\n 2.- Numero Perfecto ");
 printf("\n 3.- Numero Invertido\n ");
 printf("\n (Nota: Para realizar cualquier otra accion, debe finalizar el programa.) \n");
 printf("\n Por favor, Seleccione una opcion: ");
 scanf("%d",&opcion);
 switch(opcion)
 
 {
 	
 case 1: Pares_Impares(); break;
 case 2: Numero_Perfecto(); break;
 case 3: Inverso(); break;
 default: break;
 
 }
 
 Sleep(5000);
 return 0;
 
} 

//Escriba una función en la que se introduzcan 10 numeros enteros y determine cuales de estos enteros son pares e impares.

void Pares_Impares()

{
	
 int i=0, v, t;
 printf("\nNumeros pares e impares\n");
 for(i=1;i<=10;i++)
 
 {
 	
 printf("\n Por favor ingrese el valor:  %d: ",i);
 scanf("%d",&v);
 t=v%2;
 if (t==0)
 printf(" Es un valor Par \n");
 else
 printf(" Es un valor Impar \n");
 
 }
 
}

//Escriba una función que regrese los primeros 100 números perfectos. Esta función debe tener una función anidada que determine al número perfecto

int Perfecto(int n)

{
	
 int i, suma,t;
 suma=0;
 for (i=1;i<n;i++)
 
 {
 	
 t=n%i;
 if (t==0)
 suma=suma+i;
 
 }
 
 if (suma==n)
 return 1;
 else
 return 0;
 
}

//Escriba una función que tome un valor entero de cuatro dígitos y regrese el número con los dígitos a la inversa. Por ejemplo, dado el número 7631, la función deberá regresar 1367.

void Numero_Perfecto()

{
	
 int i,t;
 printf("\nNumeros Perfectos \n");
 for (i=1;i<=100;i++)
 
{ 

t=Perfecto(i);
 if (t==1)
 printf(" %d Es un Numero Perfecto \n",i);
 
 }
 
}

//Funcion que invierte el orden de los digitos de un numero

void Inverso()

{
	
 int i,x,t, suma;
 printf("\n Numero Invertido \n");
 printf("\n Escriba el numero de 4 digitos: ");
 scanf("%d",&x);
 suma=0;
 t=x/1000;
 x=x%1000;
 suma=suma+t;
 t=x/100;
 x=x%100;
 suma=suma+(t*10);
 t=x/10;
 x=x%10;
 suma=suma+(t*100);
 suma=suma+(x*1000);
 printf("\n El numero es= %d ", suma);
 
 
} 

