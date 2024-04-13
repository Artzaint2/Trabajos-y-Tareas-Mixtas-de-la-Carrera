/* Utilizando switch cree un programa que con 1 suma, 2 resta, 3 multiplicacion, 
  4 division y 5 modulo. */
#include <conio.h>
#include <stdio.h>

int main()
{
    char opcion;
    int n1, n2;

    do
    {
        printf( "\n   ===( CALCULADORA DIGITAL CASIO )===" );
        printf( "\n\n   1. Sumar dos n%cmeros (+).", 163 );
        printf( "\n   2. Restar dos n%cmeros (-).", 163 );
        printf( "\n   3. Multiplicar dos n%cmeros (X).", 163 );
        printf( "\n   4. Dividir dos n%cmeros (/).", 163 );
        printf( "\n   5. Modulo de dos n%cmeros (MOD).", 163);
        printf( "\n   6. SALIR DE LA CALCULADORA.\n" );

        
        do
        {
            printf( "\n   Por favor Ingrese una opci%cn (1-6): ", 162 );
            fflush( stdin );
            scanf( "%c", &opcion);

        } while ( opcion < '1' || opcion > '6' );
       
        switch ( opcion )
        {
                      
            case '1': printf( "\n   Ingrese el primer valor: " );
                      scanf( "%d", &n1);
                      printf( "\n   ingrese el segundo valor: " );
                      scanf( "%d", &n2);
                      printf( "\n   %d + %d = %d\n", n1, n2, n1 + n2 );
                      break;

                   
            case '2': printf( "\n   Ingrese el primer valor: " );
                      scanf( "%d", &n1);
                      printf( "\n   Ingrese el segundo valor: " );
                      scanf( "%d", &n2);
                      printf( "\n   %d - %d = %d\n", n1, n2, n1 - n2 );
                      break;

                     
            case '3': printf( "\n   Ingrese el primer valor: " );
                      scanf( "%d", &n1);
                      printf( "\n   Ingrese el segundo valor: " );
                      scanf( "%d", &n2);
                      printf( "\n   %d X %d = %d\n", n1, n2, n1 * n2 );
                      break;

                      
            case '4': printf( "\n   Ingrese el primer valor: " );
                      scanf( "%d", &n1);
                      printf( "\n   Ingrese el segundo valor: " );
                      scanf( "%d", &n2);
                      if ( n2 != 0 )
                          printf( "\n   %d / %d = %d \n", n1, n2, n1 / n2, n1 % n2 );
                      else
                          printf( "\n   ERROR: Dividir entre cero es Imposible.\n" );
                      break;
                          
            case '5': printf( "\n   Ingrese el primer valor: " );
                      scanf( "%d", &n1);
                      printf( "\n   Ingrese el segundo valor: " );
                      scanf( "%d", &n2);
                      if ( n2 != 0 )
                          printf( "\n   %d MOD %d = %d ( Resto = %d )\n", n1, n2, n1 % n2 );
                      else
                          printf( "\n   ERROR: el divisor no debe ser 0.\n" );
        }

    } while ( opcion != '6' );

    return 0;

}
