/*un programa que lea el precio de un art�culo, el % de descuento que ser� aplicado y el n�mero total de art�culos
a comprar para luego mostrar por pantalla el total a pagar  aplicando el descuento respectivo*/

#include <iostream>

 

using namespace std;
    int main() {

    int nodeproductos, precio;

    float descuento,total;

 

    cout<<"ingrese el precio del producto: ";
    cin>>precio;
    cout<<"ingrese el numero de productos seleccionados: ";
    cin>>nodeproductos;


    if (nodeproductos > 1)

    {

        cout<<"usted tendra un descuento del 40%" << endl;
        total = precio * nodeproductos;
        descuento=total-(total*0.40);
        cout<<"el total de su compra con descuento incluido es:"<<descuento<<endl;


    }

    else

    {

        cout<<"usted no tendra descuento";
        cout<<"el total de su compra sin descuento es: "<<precio<<endl;

    }

    system("PAUSE");

    return 0;

}
