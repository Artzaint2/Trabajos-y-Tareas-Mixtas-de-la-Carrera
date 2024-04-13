/* Desarrolle un programa que le pida al usuario que rellene una matriz de 2x2 con solo letras.*/

#include <stdio.h>
#include <string.h>

int main()
{
    char mat[2][2]; //Magnitud de la matriz
    char letras[]="algoritmsypcn";
    int i, j, x = 0;
    char abecedario[]="abcdefghijklmnopqrstuvwxyz"; 
  
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++) 
        {
           mat[i][j]=letras[x];
           ++x;
        }
    }
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            printf("[%c]",mat[i][j]);
        }
      printf("\n");
    }
    
    return 0;
}


