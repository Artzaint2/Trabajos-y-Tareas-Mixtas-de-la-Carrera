/*Crear un programa que muestre los primeros 8 numeros pares y ademas la sumatoria
  de ellos (ciclo for).*/
package ochonumerospares;


public class OchoNumerosPares {

   
    public static void main(String[] args) {
      
        int nPares=0, sumaPares=0;
        
        System.out.println("Primeros numeros pares:");
        
        for (int i = 1; i < 5; i++) {
            nPares = i*2;
            System.out.println("Numero par:"+nPares);
            sumaPares = sumaPares + nPares;
        }
        System.out.println("La suma de estos nos da: " + sumaPares);  
    }
}
