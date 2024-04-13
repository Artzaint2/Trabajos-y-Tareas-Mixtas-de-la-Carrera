/*  Hacer un programa en C++ que permita al usuario elegir calcular el area de 
figuras geometricas como: circulo, cuadrado, rectangulo, triangulo.*/

#include <iostream>
#include <math.h>

using namespace std;

float circ(float x);          // Se definen
float cuad(float x);	      // las variables
float tria(float x, float y); // que se usaran
float rect(float x, float y); // despues

int main() {
	cout << "Bienvenido, ingrese el numero de la forma correspondiente a calcular. \n";
	cout << "========================================================================== \n";
	cout << "1. Circulo \n";
	cout << "2. Cuadrado \n";
	cout << "3. Triangulo\n";
	cout << "4. Rectangulo\n";
	cout << "selecciones solo utilizando los numeros dispnibles. (1-4)\n";
	cout << "===========================================================================\n"; // Se le muestra al usuario el meu con las posibles opciones a elegir.
	int opcion;
	cin >> opcion; // El usuario introduce el indice de la opcion que desea 
	if (opcion == 1) { // Evalua si el usuario selecciono calcular el area del circulo
		float a;
		cout << "Ingrese el radio del circulo: ";
		cin >> a; // Se le pide al usuario que ingrese el radio del circulo
		cout << "El area del circulo es: " << circ(a); // Se imprime el resultado de la funcion
	} else if (opcion == 2) { // Evalua si el usuario selecciono calcular el area del cuadrado
		float a;
		cout << "Ingrese un lado del cuadrado: ";
		cin >> a; // Se le pide al usuario que ingrese un lado del cuadrado
		cout << "El area del cuadrado es: " << cuad(a); // Se imprime el resultado de la funcion
	} else if (opcion == 3) { // Evalua si el usuario selecciono calcular el area del triangulo
		float a;
		float b;
		cout << "Ingrese la base del triangulo: ";
		cin >> a; // Se le pide al usuario que ingrese la base del triangulo
		cout << "Ingrese la altura del triangulo: ";
		cin >> b; // Se le pide al usuario que ingrese la altura del triangulo
		cout << "El area del triangulo es: " << tria(a, b); // Se imprime el resultado de la funcion
	} else if (opcion == 4) { // Evalua si el usuario selecciono calcular el area del rectangulo
		float a;
		float b;
		cout << "Ingrese la base del rectangulo: ";
		cin >> a; // Se le pide al usuario que ingrese la base del rectangulo
		cout << "Ingrese la altura del rectangulo: ";
		cin >> b; // Se le pide al usuario que ingrese la altura del rectangulo
		cout << "El area del triangulo es: " << rect(a, b); // Se imprime el resultado de la funcion
	} else { // Si el usuario ingreso un numero invalido, se le hara notar el error  para que acto seguido, lo reintente.
		cout << "Opcion incorrecta. Por favor, vuelva a intentarlo.";
		return 0;		
	}
}

float circ(float x) {
	double pi; 
	double res;
	pi = atan(1)*4; // Se le da el valor de pi a la variable para usarse en la formula de area
	res = pi*pow(x,2); // Se utiliza la formula de area de un circulo
	return res; // Retorna el valor calculado
}

float cuad(float x) {
	double res;
	res = pow(x,2); // Se utiliza la formula de area de un cuadrado
	return res; // Retorna el valor calculado
}

float tria(float x, float y) {
	double res;
	res = (x * y) / 2; // Se utiliza la formula de area de un triangulo
	return res; // Retorna el valor calculado
}

float rect(float x, float y) {
	double res;
	res = x * y; // Se utiliza la formula de area de un triangulo
	return res; // Retorna el valor calculado
}
