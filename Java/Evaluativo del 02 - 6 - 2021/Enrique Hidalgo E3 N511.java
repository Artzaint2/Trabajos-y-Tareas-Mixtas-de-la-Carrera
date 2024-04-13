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
public class Ejercicio3 {
    
     //Desarrollar un programa que determine el mayor de 3 números introducidos en pantalla y la sumatorio de todos ellos

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner (System.in);
        //MAYOR DE 3 NUMEROS
        System.out.println("Primer Numero=");
        int a=scn.nextInt();
        System.out.println("Segundo Numero=");
        int b=scn.nextInt();
        System.out.println("Tercer Numero=");
        int c=scn.nextInt();
        // Si el A es mayor, entonces: 
        if(a>b && a>c){
            System.out.println("Mayor ="+a);
            System.out.println("Menor ="+b);
            System.out.println("Menor ="+c);
        }else{
            //Si el B es mayor, entonces:
          if(b>a && b>c){
            System.out.println("Mayor ="+b);
            System.out.println("Menor ="+a);
            System.out.println("Menor ="+c); 
            }else{
              //Si el C es mayor, entonces: 
          if(c>a && c>a){
            System.out.println("Mayor ="+c);
            System.out.println("Menor ="+a);
            System.out.println("Menor ="+b);
            
          }
          }
        }
    }
}
          
        
    
        
        
    

