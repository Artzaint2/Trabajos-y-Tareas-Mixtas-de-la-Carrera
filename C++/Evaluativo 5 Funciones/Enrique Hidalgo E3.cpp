/* Hacer un programa en C++ que use una función recursiva para calcular la 
potencia de un número.*/

#include <iostream>

using namespace std;

int pot(int x, int y); //Definimos la funcion que se va a usar mas adelante

int main() {
	int num, exp; //Definimos las variables del numero base y del numero exponente
	cout << "Introduzca el numero: ";
	cin >> num; // Se le pide al usuario el numero base
	cout << "Introduzca el exponente: ";
	cin >> exp; // Se le pide al usuario el numero exponente
	cout << "El resultado final es: " << pot(num, exp); // Se muestra el resultado de la funcion que calcula la potencia
	
}

int pot (int x, int y) {
	int res; // Se define la variable del resultado de la funcion
	if (y == 1) { // Evalua si el exponente es igual a 1 en caso de serlo.
		res = x; // El resultado es el numero base
	} else { 
		res = x * pot(x, y-1); // Se define una operacion recursiva que se repetira tantas veces como sea necesario.
	}
	return res; // Retorna el resultado de la funcion en la variable res
	
}
