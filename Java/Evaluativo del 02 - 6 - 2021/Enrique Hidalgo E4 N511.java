
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /* Desarrolle un programa que lea el precio de un artículo, el % de descuento que será aplicado
    y el número total de artículosa comprar para luego mostrar por pantalla el total a pagar  aplicando el descuento respectivo.*/
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
      Scanner scn=new Scanner (System.in); 
     
     double compra;
     
     System.out.println("Por favor Introduzca el monto de la compra: ");
     compra = scn.nextDouble();
     
     if(compra >=800 && compra <= 1500){
         compra -= (compra*0.1);
     }
     
     else if (compra > 1500 && compra <= 5000){
         compra -= (compra*0.15); 
     }
     
      else if (compra > 5000){
         compra -= (compra*0.2);
     }
     
      else{
          compra = compra;
          
      }
     
     System.out.println("El monto a pagar es (con descuento aplicado)= "+compra);
     
    }

    
  
    
}
