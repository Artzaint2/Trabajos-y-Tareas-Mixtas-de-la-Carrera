
package ejercicio2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;


public class LaminaCara extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        
        double width = getWidth(); // para el ancho total del frame   
        double height = getHeight(); // para la altura total del frame
        
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.RED);
       
        g2.draw(new Line2D.Double(width / 2, 0, width / 2, height)); //Linea recta
        g2.draw(new Line2D.Double(0, height / 2, width, height / 2)); //Linea Vertical
        g2.draw(new Line2D.Double(0, height, width, 0)); // Linea Diagonal derecha-izquierda
        g2.draw(new Line2D.Double(width, height, 0, 0)); // Linea Diagonal izquierda derecha
        
        double radio=80;
        
        //estas 5 Lineas de codigo representan la Cabeza
        Ellipse2D circulo=new Ellipse2D.Double();
  circulo.setFrameFromCenter(width / 2, height / 2, (width / 2) +radio, (height / 2) + radio);
        g2.setColor(Color.YELLOW);
        g2.fill(circulo);
        g2.draw(circulo);

        //estas 5 Lineas de codigo representan el ojo izquierdo
        Ellipse2D circuloNegro1=new Ellipse2D.Double();
  circuloNegro1.setFrameFromCenter(width / 2.20, height / 2.25,(width/ 2.20)+ 6, (height / 2.25) + 5);
        g2.setColor(Color.BLUE);
        g2.fill(circuloNegro1);
        g2.draw(circuloNegro1);
        
        //estas 5 Lineas de codigo representan el ojo derecho
         Ellipse2D circuloNegro2=new Ellipse2D.Double();
  circuloNegro2.setFrameFromCenter(width / 1.85, height / 2.25,(width/1.85)+ 6, (height / 2.25) + 5);
        g2.setColor(Color.BLUE);
        g2.fill(circuloNegro2);
        g2.draw(circuloNegro2);
        
        //estas 5 Lineas de codigo representan la Nariz
        Ellipse2D circuloNegro3=new Ellipse2D.Double();
  circuloNegro3.setFrameFromCenter(width / 2.01, height / 1.95,(width/2.01)+ 6, (height / 1.95) + 5);
        g2.setColor(Color.BLACK);
        g2.fill(circuloNegro3);
        g2.draw(circuloNegro3);
        
        //estas 5 Lineas de codigo representan la boca
        Ellipse2D boca=new Ellipse2D.Double();
  boca.setFrameFromCenter(width / 2, height / 1.65,(width/1.80)+ 6, (height / 1.65) + 5);
        g2.setColor(Color.BLACK);
        g2.fill(boca);
        g2.draw(boca);
        
        //estas 5 Lineas de codigo representan la lengua
        Ellipse2D lengua=new Ellipse2D.Double();
  lengua.setFrameFromCenter(width / 2, height / 1.65,(width/2)+ 6, (height / 1.65) + 5);
        g2.setColor(Color.RED);
        g2.fill(lengua);
        g2.draw(lengua);
    }
}
