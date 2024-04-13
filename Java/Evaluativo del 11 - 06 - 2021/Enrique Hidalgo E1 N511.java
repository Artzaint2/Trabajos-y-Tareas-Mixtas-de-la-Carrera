/*Crear un programa que muestre los numeros impares de forma descendiente del 50 al 0 y 
  que no muestre el numero 33 (ciclo for).*/
package numerosdel50al0;

public class Numerosdel50al0 {

    public static void main(String[] args) {
      
       int Num=49;
       
       System.out.println("Numeros Impares:");
       for (int i = 7; i >=0 ; i--) {
           System.out.println(Num);
           Num-=2;
       }
       Num-=2;
       for (int i = 15; i >=0 ; i--) {
         System.out.println(Num);
           Num-=2;  
       }
    }  
} 
