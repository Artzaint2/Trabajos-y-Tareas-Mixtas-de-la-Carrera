/* Escribe un programa que defina un vector de numeros  calcule la multiplicacion 
  acumulada de sus elementos. */

#include <iostream>
#include <cstdlib>
#include <ctime>
 
using namespace std;
 
int main(int argc, char * argv[]) {
 
    long **A, // La matriz que se multiplicara
	 *x, // Vector que se multiplicara
	 *comprueba; // Se guarda el resultado final 
 
    int n;
 
    if (argc <= 1) {/* si no pasa por parametro el tamaño de la matriz, 
                    se utiliza el numero de procesadores por defecto.*/
        cout << "Falta el tamaño de la matriz, ulitizaremos 10 por defecto."<< endl;
        n = 10;
    } else 
        n = atoi(argv[1]);
 
 
 
	A = new long *[n];//apartamos un espacio para las n filas de la matriz.
	x = new long [n];//apartamos un espacio para el vector.
 
    //llenamos la matriz
    A[0] = new long [n * n];
    for (unsigned int i = 1; i < n; i++) {
	A[i] = A[i - 1] + n;
    }
 
    // llenamos A y X con Valores al azar.
    srand(time(0));
    cout << "La matriz y el vector generados son " << endl;
    for (unsigned int i = 0; i < n; i++) {
	for (unsigned int j = 0; j < n; j++) {
	    if (j == 0) cout << "[";
	    A[i][j] = rand() % 1300;
	    cout << A[i][j];
	    if (j == n - 1) cout << "]";
	    else cout << "  ";
	}
	x[i] = rand() % 600;
	cout << "\t  [" << x[i] << "]" << endl;
    }
    cout << "\n";
 
    comprueba = new long [n];
    /*Se calcula la multiplicacion secuencial para 
    despues comprobar que es correcta la solucion. */
    for (unsigned int i = 0; i < n; i++) {
	comprueba[i] = 0;
	for (unsigned int j = 0; j < n; j++) {
	    comprueba[i] += A[i][j] * x[j];
	}
    }
 
 
    cout << "El resultado adquirido es:" << endl;
    for (unsigned int i = 0; i < n; i++) {
	cout << comprueba[i] << endl;
    }
 
    delete [] comprueba;
    delete [] A[0];
 
 
    delete [] x;
    delete [] A;
 
    system("PAUSE");
    return 0;
 
}
