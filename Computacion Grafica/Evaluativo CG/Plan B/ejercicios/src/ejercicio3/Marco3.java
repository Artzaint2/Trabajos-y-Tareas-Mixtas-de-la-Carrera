/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import javax.swing.JFrame;

/**
 *
 * @author Walter
 */
public class Marco3 extends JFrame {
    public Marco3(){
        setBounds(400, 250, 460, 350); //Para poner el tamaño del frame
        setResizable(false); //para que no se muevan las lineas
        setTitle("Carrito");
        CarroConstructor lamina = new CarroConstructor();
        add(lamina);
    }
}
