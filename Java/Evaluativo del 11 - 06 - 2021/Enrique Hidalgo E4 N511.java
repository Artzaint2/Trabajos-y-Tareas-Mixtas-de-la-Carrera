/*Utilizando el while crear un programa que pida al usuario su contraseña numerica.
  debera terminar cuando introduzca como contraseña el numero 4567,
  El programa debe de ser capaz de pedir la contraseña tantas veces como sea necesario.*/
package contraseña;

import java.util.Scanner;

public class Contraseña {

    public static void main(String[] args) {
        
        int Clave=0, claveCorrecta=4567;
        Scanner Num=new Scanner(System.in);
        
        do{
            System.out.println("Por favor, introduzca la clave: ");
            Clave=Num.nextInt();
            if(Clave!=claveCorrecta){
                System.out.println("Acceso denegado, Intentelo de nuevo por favor.");
            }
          }while (Clave!=claveCorrecta);
                System.out.println("Acceso concedido, bienvenido.");
    }  
} 
