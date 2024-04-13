/* Utilizando el do while crear un programa que pida numeros positivos al usuario 
  y que calcule la suma de todos ellos. El programa terminara cuando se teclee 
  un numero negativo o el 0. */
  
#include<stdio.h>
#include<conio.h>

int main(){
{
     int valor;
     do {
         printf("Porfavor escriba un valor entre los numeros 0 y 999 (0 finaliza): ");
         scanf("%i",&valor);
         if (valor >= 100)
         {
             printf("Posee 3 digitos.");
         }
         else
         {
             if (valor >= 10)
             {
                 printf("Posee 2 digitos.");
             }
             else
             {
                 printf("Posee 1 digito.");
             }
         }
         printf("\n");
     } while (valor != 0);
     getch();
     
     
     return 0;
    }
}
