/*Crear un programa que muestre los primeros 8 numeros pares y ademas la sumatoria
  de ellos (ciclo for). */
  #include <iostream>
  #include <stdio.h>

int main(){
	int i,suma= 0;
	
	for(i=1;i<=16;i++){
		if(i%2==0){
			suma += i;
		}
	}
	
	printf("\n los 8 numeros pares iniciales son : 2, 4, 6, 8, 10, 12, 14, 16");
	printf("\n que al sumar, obtenemos : %i",suma); 
	
	system("PAUSE");
	return 0;
    }


