/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Walter
 */
public class LaminaLineas extends JPanel {
   public void paintComponent(Graphics g) {
        super.paintComponents(g);
        
        //se inicializan estas variables para sumarlas luego en x2,y2
        int x = 0;
        int y = 0;
        
        for (int i = 0; i <= 10; i++) {
            //pone un color para cada linea
            if (i % 2 == 0) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.BLUE);
            }
            g.drawLine(0,0,40 + x,200 + y);
            x += 25;
            y -= 17;
        }
   }
}
