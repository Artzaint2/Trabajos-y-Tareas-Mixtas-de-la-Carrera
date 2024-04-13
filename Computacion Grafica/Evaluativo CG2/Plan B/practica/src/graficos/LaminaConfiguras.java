package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

class LaminaConfiguras extends JPanel {
    public void paintComponent(Graphics g){
        
       
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        double width = getWidth(); 
        double height = getHeight(); 
        
        //Este parrafo es para el Cuadrado Numero 4
        Rectangle2D Cuadro4 = new Rectangle2D.Double(30, 20, 400, 390);
        g2.setColor(Color.MAGENTA);
        g2.draw(Cuadro4);
        g2.fill(Cuadro4);
        
        //Este parrafo es para el Cuadrado Numero 3
        Rectangle2D Cuadro3 = new Rectangle2D.Double(80, 70, 300, 290);
        g2.setColor(Color.CYAN);
        g2.draw(Cuadro3);
        g2.fill(Cuadro3);
        
        //Este parrafo es para el Cuadrado Numero 2
        Rectangle2D Cuadro2 = new Rectangle2D.Double(135, 120, 190, 190);
        g2.setColor(Color.MAGENTA);        
        g2.draw(Cuadro2);
        g2.fill(Cuadro2);
        
        //Este parrafo es para el cuadrado central
        Rectangle2D Cuadro1 = new Rectangle2D.Double(180, 165, 100, 100);
        g2.setColor(Color.CYAN);
        g2.draw(Cuadro1);
        g2.fill(Cuadro1);
        
        //estos dos parrafos de codigo son para las lineas diagonale del cuadrado
        
        Line2D Linea1 = new Line2D.Double(30, 20, 430, 410);
        g2.setColor(Color.BLACK);
        g2.draw(Linea1);
        
        Line2D Linea2 = new Line2D.Double(430, 20, 30, 410);
        g2.setColor(Color.BLACK);
        g2.draw(Linea2);
        
     
        //estas lineas agregan el codigo a los cuadros
        Font letras = new Font("Arial", Font.BOLD, 12);
        g2.setFont(letras);
        g2.setColor(Color.BLUE);
        g2.drawString("Elvis Cocho",190,90);
        g2.drawString("Elsa Pato", 200, 350);
        g2.drawString("Pongan Bachata", 180, 15);
       
    }
    
}
