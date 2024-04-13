/* Escriba un programa que determine si una palabra es palíndromo.
Un palíndromo es un array de caracteres que se lee de igual forma en ambos sentidos; por ejemplo ana.*/

#include<stdio.h>
#include<conio.h>
#include<string.h>

main()

{
	//en primer lugar hacemos que el codigo determine la palabra 
	
	
 char palabra[80];
 int x,y,z;
   printf("\t Programa que determina si una palabra es palindromo o no.");
   printf("\n\nEscriba una palabra: ");
   scanf(" %s",palabra);
   x=strlen(palabra);
   x=x-1;
   
//ahora hacemos que el codigo diga si es o no es un Palindromo.
   
 for(y=0,z=x;y<=x/2;y++,z--)
          if(palabra[y]==palabra[z])
             printf("Es palindromo");
 else
                printf("No es palindromo");
 getch();
 

}
