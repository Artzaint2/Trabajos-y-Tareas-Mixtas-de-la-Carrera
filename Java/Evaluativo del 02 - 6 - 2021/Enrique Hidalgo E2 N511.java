/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner; 

public class Ejercicio2 {
    
     //Desarrolle un programa que indique si el númeroes par o impar

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.printf( "Ingrese un numero entero: " );
        numero = teclado.nextInt();
        // Numero par
        if ( numero % 2 == 0 )
        {
            System.out.println( "El numero es Par." );
        }
        // Numero impar
        else
        {
            System.out.println( "El numero es Impar." );
        }
    }
}
        
        
        
        
        
        
    
    

