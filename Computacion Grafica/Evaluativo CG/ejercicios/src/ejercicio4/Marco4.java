/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import javax.swing.JFrame;

/**
 *
 * @author Walter
 */
public class Marco4 extends JFrame {
    public Marco4() {    
        setBounds(600,350,700,500);
        setResizable(false);
        setTitle("Recuadro");
        Lamina fondo = new Lamina();
        add(fondo); 
    }
}
