/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
//Pedir un numero e indicar si es positivo o negativo
import java.util.Scanner;
public class Ejercicio1 {

    //Desarrolle un programa que lea un númeropor pantalla y diga si positivo o negativo
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
     //Preguntar al usuario por un Numero, el programa mostrara si es Negativo o Positivo.
        int a;
     System.out.println("Ingrese un numero");
     a=teclado.nextInt();
     if(a>0)
       System.out.println("El numero ingresado es positivo");
     else
     System.out.println("El numero Ingresado es negativo");
     }
}
        
        
        
    
    

