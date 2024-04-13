
package ejercicio2;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CaraConLineas {
    public static void main(String[] args) {
        Marco2 marco1 = new Marco2();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



class LaminaCara extends JPanel {
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
        
        Ellipse2D circulo=new Ellipse2D.Double();
	circulo.setFrameFromCenter(width / 2, height / 2, (width / 2) +radio, (height / 2) + radio);
        g2.setColor(Color.YELLOW);
        g2.fill(circulo);
        g2.draw(circulo);
        
        Ellipse2D circuloNegro=new Ellipse2D.Double(width / 14, height / 14,(width/ 14)+ 5, (height / 14) + 5);
	circuloNegro.setFrameFromCenter(0,0,0,0);
        g2.setColor(Color.BLACK);
        g2.fill(circuloNegro);
        g2.draw(circuloNegro);

    }
}
