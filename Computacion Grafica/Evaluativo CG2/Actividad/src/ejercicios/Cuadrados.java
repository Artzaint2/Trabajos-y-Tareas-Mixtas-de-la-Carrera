package ejercicios;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Cuadrados {
    public static void main(String[] args ){
        MarcoConDibujos mimarco=new MarcoConDibujos();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujos extends JFrame {
    public MarcoConDibujos(){
        
        setVisible(true);
        setTitle("Dibujo");
        setResizable(false);
        setSize(500,500);
        setLocationRelativeTo(null);
        LaminaConfiguras milamina=new LaminaConfiguras();
        add(milamina);
    }
}

class LaminaConfiguras extends JPanel {
    public void paintComponent(Graphics g){          
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        int a = 0;
        int b = 0;
        int c = 0;
        Color colores; //variable para agregar el colro luego
        
        for (int i = 0; i < 4; i++) {
            colores = (i % 2 == 0) ? Color.ORANGE : Color.RED; //Si es verdadero es magenta, sino cyan
            g2.setColor(colores); //Para colocar el color general
            g2.fill(new Rectangle2D.Double(30 + a, 20 + b, 400 - c, 390 - c)); //Los 4 cuadros se van agregando con el ciclo
            a += 50;
            b += 50;
            c += 100;
        }
       
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
        g2.setColor(Color.black                                                                                                                                          );
        g2.drawString("Big Mac 2x1",200,90);
        g2.drawString("Ronald McDonad", 190, 350);
        g2.drawString("McDonalds", 200, 15);
               
        //g.drawLine(100, 100, 300, 200);
        //g.drawLine(50, 50, 200, 200);
        //g.drawArc(50, 100, 200, 150, 120, 150);
    }    
}