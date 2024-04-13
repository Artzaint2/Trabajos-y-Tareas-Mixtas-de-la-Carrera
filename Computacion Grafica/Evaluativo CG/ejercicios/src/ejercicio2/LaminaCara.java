/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

/**
 *
 * @author Walter
 */
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

        Ellipse2D ojoIzq=new Ellipse2D.Double(161,129,14,20);
	g2.setPaint(Color.blue);
	g2.fill(ojoIzq);
	
        //estas 3 Lineas de codigo representan el ojo derecho
	Ellipse2D ojoDer=new Ellipse2D.Double(205,129,14,20);
	g2.setPaint(Color.blue);
	g2.fill(ojoDer);
        
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
