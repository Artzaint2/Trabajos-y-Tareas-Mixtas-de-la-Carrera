/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoo;

import java.awt.event.KeyEvent;
import java.io.*;

/**
 *
 * @author Carlos
 */
public class Métodos {

    //Método que valida que los caracteres que estén siendo escritos en un campo de texto sean solamente letras.
    public void soloLetras(KeyEvent evt){
        Character x;
        x = evt.getKeyChar();
        if(!Character.isLetter(x)&&x!=KeyEvent.VK_SPACE){
            evt.consume();
        }
    }
    
}