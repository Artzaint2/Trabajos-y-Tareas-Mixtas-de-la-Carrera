/*Utilizando switch cree un programa que con 1 suma, 2 resta, 3 multiplicacion, 
  4 division y 5 modulo.*/
package menuoperaciones;

import java.util.Scanner;

public class MenuOperaciones {

  
    public static void main(String[] args) {
        
        int n, a=0, b=0, c=0;
        Scanner Num=new Scanner(System.in);
        System.out.println("Por favor introduzca el primer valor: ");
            a=Num.nextInt();
        System.out.println("Por favor introduzca el segundo valor valor: ");
            b=Num.nextInt();    
        System.out.println("\n1.SUMA\n2.RESTA\n3.MULTIPLICACION\n4.DIVISION\n5.MODULO\n6.SALIR");
        System.out.println("Por favor, ecoja una de estas opciones: ");
            n=Num.nextInt();
            
        switch (n){
            case 1:
              c = a + b;
              System.out.println("SUMA: "+a+"+"+b+"="+ c);
              break;
              
            case 2:
              c = a - b;
              System.out.println("RESTA: "+a+"-"+b+"="+ c);
              break;
              
            case 3:
              c = a * b;
              System.out.println("MULPLICACION: "+a+"*"+b+"="+ c);
              break; 
              
            case 4:
              c = a / b;
              System.out.println("DIVISION: "+a+"/"+b+"="+ c);
              break;
              
            case 5:
              c = a % b;
              System.out.println("MOD: "+a+"%"+b+"="+ c);
              break;
              
            case 6:
              System.exit(0);
        }   
    } 
} 
