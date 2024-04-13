//Crea el código de un programa que cumpla las premisas indicadas por el profesor (arrays)

#include <stdio.h>
#include <stdlib.h>

int main()

 {
 	
 	//primero ingresamos el orden de los caracters
 	
    char arrayDeCincoChar[4];
    arrayDeCincoChar[0] = 'a';
    arrayDeCincoChar[1] = 'b';
    arrayDeCincoChar[2] = 'e';
    arrayDeCincoChar[3] = 't';
    arrayDeCincoChar[4] = 'o';
    
    //ahora ponemos la frase final
    
    printf("La palabra en el array es %c%c%c%c%c\n\n", arrayDeCincoChar[0], arrayDeCincoChar[1], arrayDeCincoChar[2], arrayDeCincoChar[3], arrayDeCincoChar[4]);
    arrayDeCincoChar[2] = 'a';
    
    system("PAUSE");
    return 0;
}


/* Respuestas a las Preguntas

a) ¿Qué índice o localizador tiene el primer elemento del array? ¿Y el último?

El índice del primer elemento es 0 y el último es 4.

b) ¿Qué ocurre si intentamos mostrar por pantalla una letra con un índice que no está definido para ese array de caracteres?

Que el programa muestra un espacio en blanco en su lugar.

c) Modifica la tercera letra de la cadena para que pase a ser la letra a. A continuación muestra el mismo contenido que anteriormente. En esta ocasión, dado que hemos modificado la tercera letra, deberá mostrarse por pantalla: "La palabra en el array es abata".

(Si modificamos la tercera letra por una "a" la palabra final va a ser abato, si cambiamos la tercera y última letra por una "a" el resultado sería la palabra abata)

#include <stdio.h>
#include <stdlib.h>
int main() {
    char arrayDeCincoChar[4];
    arrayDeCincoChar[0] = 'a';
    arrayDeCincoChar[1] = 'b';
    arrayDeCincoChar[2] = 'e';
    arrayDeCincoChar[3] = 't';
    arrayDeCincoChar[4] = 'o';
    printf("La palabra en el array es %c%c%c%c%c\n\n", arrayDeCincoChar[0], arrayDeCincoChar[1], arrayDeCincoChar[2], arrayDeCincoChar[3], arrayDeCincoChar[4]);
    arrayDeCincoChar[2] = 'a';
    printf("La palabra en el array es %c%c%c%c%c\n\n", arrayDeCincoChar[0], arrayDeCincoChar[1], arrayDeCincoChar[2], arrayDeCincoChar[3], arrayDeCincoChar[4]);
    return 0;
}

Para que este código diga abata se debería agregar arrayDeCincoChar[4] = 'a'; entre las filas 12 y 13 */
