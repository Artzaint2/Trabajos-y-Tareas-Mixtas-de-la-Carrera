/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Walter
 */
public class CarroConstructor extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;       
        int altura = getHeight();
        int ancho = getWidth();
       
        //fondo blanco
        g2.setColor ( Color.WHITE ) ;
        g2.fillRect ( 0, 0, ancho, altura) ;
        
        // rueda frontal
        g2.setColor ( Color.black ) ;
        g2.fillOval ( 20, 170, 100, 100 ) ;
        g2.setColor ( Color.white ) ;
        g2.fillOval ( 30, 180, 80, 80 ) ;
        g2.setColor ( Color.black ) ;
        g2.drawOval ( 40, 190, 60, 60 ) ;

        // rueda de atras
        g2.setColor ( Color.black ) ;
        g2.fillOval ( 270, 170, 100, 100 ) ;
        g2.setColor ( Color.white ) ;
        g2.fillOval ( 280, 180, 80, 80 ) ;
        g2.setColor ( Color.black ) ;
        g2.drawOval ( 290, 190, 60, 60 ) ;

        // capota
        g2.setColor ( Color.BLACK ) ;
        g2.fillRect ( 10, 113, 122, 12 ) ;
        g2.setColor ( Color.RED ) ;
        g2.fillRect ( 10, 123, 122, 82 ) ;

        // adorno de la capota
        g2.setColor ( Color.YELLOW ) ;
        g2.fillOval ( 10, 105, 10, 10 ) ;

         //  ventanas
         g2.setColor(Color.CYAN ) ;
         g2.fillRect(130, 15, 130, 100 ) ; 

        // puerta
         g2.setColor(Color.RED ) ;
         g2.fillRect(130, 113, 130, 92 ) ;

        // asiento de atras
         g2.setColor(Color.RED ) ;
         g2.fillRect(258, 15, 122, 190 ) ;

        // maletero
        g2.setColor(Color.RED ) ;
        g2.fillRect(378, 80, 57, 125 ) ;

        // visor
        g2.setColor(Color.black ) ;
        g2.drawLine(131, 15, 110, 30) ;
        g2.drawLine(131, 16, 110, 31) ;
        g2.drawLine(131, 17, 110, 32) ;

        // manilla
        g2.setColor(Color.black ) ;
        g2.drawLine(145, 125, 170, 125) ;
        g2.drawLine(145, 124, 170, 124) ;
        g2.drawLine(145, 123, 170, 123) ; 
         
        //parte de abajo ruedas
        g2.setColor(Color.BLACK) ;
        g2.fillRect(120, 205, 152, 11 ) ;
         
        // Texto central
        Font mifuente = new Font("Arial", Font.BOLD, 26);
        g2.setFont(mifuente);
        g2.setColor(Color.BLUE);
        g2.drawString("Not Toty's", 100, 150);
        g2.drawString("Fashion", 150, 180);
    }
}