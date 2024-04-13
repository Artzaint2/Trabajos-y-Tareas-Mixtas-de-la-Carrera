/* Realizar un programa que lee por teclado la fecha actual y la fecha de nacimiento 
de una persona y calcula su edad.*/

#include <iostream>

using namespace std;

int fecha_valida(int d, int m, int a);                             // Se crean las funciones
int bisiesto(int d, int m, int a);                                 // que van a usar 
int calcular_edad(int dA, int mA, int aA, int dN, int mN, int aN); // despues


int main() {
	int diaA, mesA, anoA; // Se crean las variables del dia, mes y año actual
	cout << "Introduzca el dia de hoy (en numeros): "; cin >> diaA; // Se le pide al usuario que ingrese el dia actual
	cout << "Introduzca el mes actual (en numeros): "; cin >> mesA; // Se le pide al usuario que ingrese el mes actual
	cout << "Introduzca el año actual: "; cin >> anoA; // Se le pide al usuario que ingrese el año actual
	if (fecha_valida(diaA, mesA, anoA) == 0) { // Se llama a la funcion, si la funcion retorna un valor que indica que la fecha es incorrecta, el usuario sera notifidicado del error
		cout << "La fecha introducida es invalida, por favor verifique sus datos e intente nuevamente.";
		return 0;
	}
	int diaN, mesN, anoN;// Se crean las variables del dia, mes y año de nacimiento
	cout << "Introduzca el dia de nacimiento (en numero): "; cin >> diaN; // Se le pide al usuario que ingrese el dia de nacimiento
	cout << "Introduzca el mes de nacimiento (en numero): "; cin >> mesN; // Se le pide al usuario que ingrese el mes de nacimiento
	cout << "Introduzca el año de nacimiento: "; cin >> anoN; // Se le pide al usuario que ingrese el año de nacimiento
	if (fecha_valida(diaN, mesN, anoN) == 0) { // Se llama a la funcion, si la funcion retorna un valor que indica que la fecha es incorrecta, el usuario sera notifidicado del error
		cout << "La fecha de nacimiento es invalida, por favor verifique sus datos e intente nuevamente.";
		return 0;
	}
	if (anoN > anoA) { // Si el año de nacimiento es mayor al mes actual, notificara al usuario del error
		cout << "El año de nacimiento es mayor al año actual, por favor verifique sus datos.";
		return 0;
	}
	cout << "La edad calculada es: " << calcular_edad(diaA, mesA, anoA, diaN, mesN, anoN); // Se imprime el resultado de la funcion que calcula la edad
}
int fecha_valida(int d, int m, int a) { // Funcion para comprobar la existencia de las fechas ingresadas
	if (d < 1 || d > 31) { // Evalua si el dia ingresado esta dentro del rango permitido (1-31)
		return 0; // Si no esta dentro del rango, devolvera el valor 0, que significa que la fecha ingresada no es valida
	}
	if (m > 0 && m < 12) { // Evalua si el mes ingresado esta dentro del rango permitido (1-12)
		if (m == 2) { // Evalua si el mes ingresado es Febrero
			if (d >= 30) { // Si el mes ingresado es Febrero, evaluara si tiene mas de 30 dias
				return 0;	
			}
		} else if (m == 4 || m == 6 || m == 9 || m == 11) { // if que evalua si el mes ingresado es algun mes con 30 dias
			if (d == 31) { // Si es el mes ingresado no tiene 31 dias pero la variable de dias tiene un valor de 31, la funcion retornara el valor 0
				return 0;
			}
		}
	}
	
	if (bisiesto(d, m, a) == 0) { // Se llama a la funcion bisiesto para comprobar si el año ingresado es un año bisiesto
		return 0;
	}
	return 1; // Si la fecha ingresada es valida, la funcion retornara el valor 1, que significa que la fecha si existe
}

int calcular_edad(int dA, int mA, int aA, int dN, int mN, int aN) { // Funcion para calcular la edad una vez que se verifican las fechas
	int difAnos = aA - aN; // Se calcula la diferencia de años entre el actual y el de nacimiento
	if (mA > mN) { // Si el mes actual es mayor al mes de nacimiento, significa que la resta de años que se efectuo en la linea anterior es suficiente para calcular la edad
		return difAnos; // Retorna el valor de diferecia entre los años ingresados
	} else if (mN > mA) { // En caso de que no, si el mes de nacimiento es mayor al mes actual, significa que la persona no ha cumplido años todavia
		difAnos--; // Se le resta 1 a la diferencia de años 
		return difAnos;
	} else if (mN == mA) { // Si el mes de nacimiento y el mes actual son iguales, comprobara que el dia actual es mayor al dia de nacimiento
		if (dA > dN) {
			return difAnos;
		} else if (dN > dA) { // Si el dia de nacimiento es mayor al dia actual, significa que la persona no ha cumplido años todavia
			difAnos--; // Se le resta 1 a la diferencia de años 
			return difAnos;
		}
	}
}

int bisiesto(int d, int m, int a) { // Funcion que evaluara si el años ingresados son bisiestos
	if (a % 4 != 0 && d > 28 && m == 2) { // Condicion que evalua si el año no es bisiesto, el mes es febrero y el dia es mayor a 28
		
        
        return 0; // Retorna 0 que significa que la fecha es invalida
	}
	return 1; // Retorna 1 que significa que la fecha es valida
}
