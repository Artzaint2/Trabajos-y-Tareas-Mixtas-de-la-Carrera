/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import javax.swing.JFrame;

/**
 *
 * @author Walter
 */
public class Marco2 extends JFrame {
    public Marco2(){
        setBounds(400, 250, 400, 400); //Para poner el tamaño del frame
        setResizable(false); //para que no se muevan las lineas
        setTitle("Lineas");
        LaminaCara lamina = new LaminaCara();
        add(lamina);
    }
}
