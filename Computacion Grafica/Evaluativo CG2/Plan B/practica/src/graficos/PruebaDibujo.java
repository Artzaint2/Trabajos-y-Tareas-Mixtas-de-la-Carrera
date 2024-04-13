package graficos;

import javax.swing.JFrame;

public class PruebaDibujo {
    public static void main(String[] args ){
        MarcoConDibujos mimarco=new MarcoConDibujos();
        mimarco.setVisible(true); //esto es para hacer visible la ventana
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //esto es para que la ventana cierre completamente.
        
    }
}
