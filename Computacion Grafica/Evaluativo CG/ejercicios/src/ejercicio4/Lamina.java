/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Walter
 */
public class Lamina extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; 
        //Alto y ancho del Frame
        int altura = getHeight();
        int ancho = getWidth();
        
        //Color de fondo
        g2.setColor ( Color.CYAN ) ;
        g2.fillRect ( 0, 0, ancho, altura) ;
        
        // Fuentes normales
        Font fuenteDialog = new Font("Dialog", Font.PLAIN, 12);
        g2.setFont(fuenteDialog);
        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Dialog. NORMAL", 20, 20);   
        
        Font fuenteSans = new Font("SansSerif", Font.PLAIN, 12);
        g2.setFont(fuenteSans);
        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Sans Serif. NORMAL", 40, 40); 
        
        Font fuenteSerif = new Font("Serif", Font.PLAIN, 12);
        g2.setFont(fuenteSerif);
        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Serif. NORMAL", 60, 60); 
        
        Font fuenteMono = new Font("Monospaced", Font.PLAIN, 12);
        g2.setFont(fuenteMono);
        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Monospaced. NORMAL", 80, 80); 
        
        Font fuenteDInput = new Font("DialogInput", Font.PLAIN, 12);
        g2.setFont(fuenteDInput);
        g2.setColor(Color.DARK_GRAY);
        g2.drawString("DialogInput. NORMAL", 100, 100); 
        
        //Fuentes Negritas
        Font fuenteDialog2 = new Font("Dialog", Font.BOLD, 12);
        g2.setFont(fuenteDialog2);
        g2.setColor(Color.BLACK);
        g2.drawString("Dialog. NORMAL", 120, 120);   
        
        Font fuenteSans2 = new Font("SansSerif", Font.BOLD, 12);
        g2.setFont(fuenteSans2);
        g2.setColor(Color.BLACK);
        g2.drawString("Sans Serif. NORMAL", 140, 140); 
        
        Font fuenteSerif2 = new Font("Serif", Font.BOLD, 12);
        g2.setFont(fuenteSerif2);
        g2.setColor(Color.BLACK);
        g2.drawString("Serif. NORMAL", 160, 160); 
        
        Font fuenteMono2 = new Font("Monospaced", Font.BOLD, 12);
        g2.setFont(fuenteMono2);
        g2.setColor(Color.BLACK);
        g2.drawString("Monospaced. NORMAL", 180, 180); 
        
        Font fuenteDInput2 = new Font("DialogInput", Font.BOLD, 12);
        g2.setFont(fuenteDInput2);
        g2.setColor(Color.BLACK);
        g2.drawString("DialogInput. NORMAL", 200, 200); 
        
        //Fuentes Cursivas
        Font fuenteDialog3 = new Font("Dialog", Font.ITALIC, 12);
        g2.setFont(fuenteDialog3);
        g2.setColor(Color.BLUE);
        g2.drawString("Dialog. NORMAL", 220, 220);   
        
        Font fuenteSans3 = new Font("SansSerif", Font.ITALIC, 12);
        g2.setFont(fuenteSans3);
        g2.setColor(Color.BLUE);
        g2.drawString("Sans Serif. NORMAL", 240, 240); 
        
        Font fuenteSerif3 = new Font("Serif", Font.ITALIC, 12);
        g2.setFont(fuenteSerif3);
        g2.setColor(Color.BLUE);
        g2.drawString("Serif. NORMAL", 260, 260); 
        
        Font fuenteMono3 = new Font("Monospaced", Font.ITALIC, 12);
        g2.setFont(fuenteMono3);
        g2.setColor(Color.BLUE);
        g2.drawString("Monospaced. NORMAL", 280, 280); 
        
        Font fuenteDInput3 = new Font("DialogInput", Font.ITALIC, 12);
        g2.setFont(fuenteDInput3);
        g2.setColor(Color.BLUE);
        g2.drawString("DialogInput. NORMAL", 300, 300); 
    }
}
