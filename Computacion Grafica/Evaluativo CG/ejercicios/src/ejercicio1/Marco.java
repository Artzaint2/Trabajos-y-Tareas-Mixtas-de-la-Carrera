/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import javax.swing.JFrame;

/**
 *
 * @author Walter
 */
public class Marco extends JFrame {
    public Marco(){
        setBounds(600, 400, 400, 400); //Para poner el tamaño del frame
        setResizable(false); //para que no se muevan las lineas
        setTitle("Lineas");
        LaminaLineas lamina = new LaminaLineas();
        add(lamina);
    }
}
