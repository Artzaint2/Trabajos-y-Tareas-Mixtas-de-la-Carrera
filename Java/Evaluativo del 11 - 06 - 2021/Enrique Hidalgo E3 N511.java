/*Utilizando el do while crear un programa que pida numeros positivos al usuario 
  y que calcule la suma de todos ellos. El programa terminara cuando se teclee 
  un numero negativo o el 0.*/
package sumadenumerospositivos;

import java.util.Scanner;

public class SumaDeNumerosPositivos {

    public static void main(String[] args) {
       
        int nPositivos=0, sumaPositivos=0;
        Scanner Num=new Scanner(System.in);
        
        do{
            System.out.println("Introduzca numeros positivos.\nPara dejar de ingresar, teclee un numero negativo o un 0: ");
            nPositivos=Num.nextInt();
            sumaPositivos= sumaPositivos+nPositivos;
            
        }while(nPositivos>=0);
            System.out.println("La suma de todos los numeros introducidos en el programa es: "+ sumaPositivos);
    } 
    
}
