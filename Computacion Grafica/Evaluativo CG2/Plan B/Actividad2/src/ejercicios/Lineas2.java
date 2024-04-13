package ejercicios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lineas2 {
    public static void main(String[] args) {
        Marco marco1 = new Marco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




class Marco extends JFrame {
    public Marco() {  	
    	Toolkit mipantalla = Toolkit.getDefaultToolkit();
    	Dimension tamanoPantalla = mipantalla.getScreenSize();
    	
    	int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        
        setBounds(anchoPantalla/4,alturaPantalla/4,500,500);
        setResizable(false);
        setTitle("Diamantes");
        Lineas milinea = new Lineas();
        add(milinea);
    } 
}

class Lineas extends JPanel{
   public void paintComponent(Graphics g) {
       super.paintComponent(g);
       
       int altura = getHeight();
       int ancho = getWidth();
       
       int a = 0;
       int b = 0;
       
       for (int i=0; i<9; i++) {   
           g.setColor(Color.red); // cambia el color de la lineas superior izquierda y inferior derecha
           g.drawLine(0,0,50 + a,315 - b);
           g.drawLine(ancho,altura, 50 + a,315 - b);
           g.setColor(Color.blue); // cambia el color de la lineas inferior izquierda y superior derecha
           g.drawLine(ancho, 0,60 + a, 70 + b);
           g.drawLine(0, altura,60 + a,70 + b);
           a += 50;
           b += 35;
       }
   }
}



