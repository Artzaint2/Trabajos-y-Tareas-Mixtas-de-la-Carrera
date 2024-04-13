package graficos;

import javax.swing.JFrame;

class MarcoConDibujos extends JFrame {
    public MarcoConDibujos(){
        
        setVisible(true);
        setTitle("Cuadrado");//Titulo de la Ventana
        setResizable(false);//deshabilitar el reajuste de la ventana
        setSize(500,500);//tamaño de la ventana
        setLocationRelativeTo(null);//esto hace que la ventana abra en el centro de la pantalla
        LaminaConfiguras milamina=new LaminaConfiguras();
        add(milamina);
    }
}
