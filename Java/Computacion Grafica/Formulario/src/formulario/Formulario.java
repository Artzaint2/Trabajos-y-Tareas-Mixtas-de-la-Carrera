package formulario;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.*;
public class Formulario {
     
    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        v1.setVisible(true);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

        class Ventana extends JFrame implements ActionListener{ 
        //declarando toda la parte del menu
        JMenuBar barra;
        JMenuBar Barra;
        JMenu Programa;
        JMenuItem Guardar, Limpiar, Cerrar, Creditos;
        JScrollPane barraScroll;
         
        //inputs necesarios para el formulario
        JTextField nombreIng;
        JTextField apellidosIng;
        JRadioButton s1;
        JRadioButton s2;
        JRadioButton s3;
        JComboBox dia;
        JComboBox mes;
        JComboBox año;
        JTextArea panelDatos; 
        JTextField contraseñaIng;
        JTextField contraseña2Ing;
        JTextField correo1;
        JComboBox correoTipo;
        JCheckBox tecnologia;
        JCheckBox economia;
        JCheckBox juegos;
        JCheckBox musica;
        JCheckBox deportes;
        JCheckBox fotografia;       
        ButtonGroup grupoDeBotones;
        //libreria adicional
        JDateChooser calendario;
        
        //Array para todas las personas y todos los Checkbox
        ArrayList<JCheckBox> check;
        ArrayList<Persona> listaPersonas = new ArrayList();
        
        public Ventana() {
            //se construye el frame y se va inicializando cada parte
            setTitle("Formulario");
            setResizable(false);
            setBounds(1000, 800, 770, 510);
            setLocationRelativeTo(null);
                       
            check = new ArrayList<>();
            //campo y label de nombre
            JLabel nombre = new JLabel("Nombre");
            nombre.setBounds(45,20,55,30);
            nombre.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
            add(nombre);
            
            nombreIng = new JTextField();
            nombreIng.setBounds(10, 55, 115, 30);
            nombreIng.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(nombreIng);
            
            //campo y label de los apellidos
            JLabel apellidos = new JLabel("Apellidos");
            apellidos.setBounds(190,20,75,30);
            apellidos.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
            add(apellidos);
            
            apellidosIng = new JTextField();
            apellidosIng.setBounds(160, 55, 115, 30);
            apellidosIng.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(apellidosIng);
            
            //botones de tipo radio para las 3 opciones
            JLabel sexo = new JLabel("G E N E R O");
            sexo.setBounds(116,90,100,30);
            sexo.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
            add(sexo);
            
            s1 = new JRadioButton("Masculino");
            s1.setBounds(10, 115, 90, 30);
            s1.setOpaque(false);
            s1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            this.add(s1);
            
            s2 = new JRadioButton("Femenino");
            s2.setBounds(100, 115, 90, 30);
            s2.setOpaque(false);
            s2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            this.add(s2);
            
            s3 = new JRadioButton("Prefiero no Decirlo");
            s3.setBounds(185, 115, 155, 30);
            s3.setOpaque(false);
            s3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            this.add(s3);
            
            //Para poder seleccionar solo uno se colocan en la clase grupo
            grupoDeBotones = new ButtonGroup();
            grupoDeBotones.add(s1);
            grupoDeBotones.add(s2);
            grupoDeBotones.add(s3);
            
            //Todo lo referente al calendario
            JLabel nacimiento = new JLabel("N A C I M I E N T O");
            nacimiento.setBounds(480,20,155,30);
            nacimiento.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
            add(nacimiento);
                       
            calendario = new JDateChooser();
            calendario.setDateFormatString("dd/MM/yyyy");
            //Para que sea en español
            calendario.setLocale(new Locale("es"));
            calendario.setBounds(420, 58, 259, 20);
            this.add(calendario);
            
            //cuadro donde se colocan las personas
            JLabel datos = new JLabel("DATOS VERIFICADOS");
            datos.setBounds(465,90,160,30);
            datos.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
            add(datos);
            
            panelDatos = new JTextArea();
            barraScroll = new JScrollPane(panelDatos);
            barraScroll.setBounds(375, 130, 350, 261);
            panelDatos.setEditable(false);
            panelDatos.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(barraScroll);
            
            //label de registro
            JLabel cuenta = new JLabel("R E G I S T R O");
            cuenta.setBounds(106,140,120,30);
            cuenta.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
            add(cuenta);
            
            //el correo junto con sus opciones
            JLabel correo = new JLabel("Correo:");
            correo.setBounds(20,170,50,30);
            correo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(correo);
            
            correo1 = new JTextField("");
            correo1.setBounds(70,170,100,30);
            correo1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(correo1);
            
            correoTipo = new JComboBox();
            correoTipo.setBounds(175,170,140,30);
            correoTipo.addItem("@Hotmail.com");
            correoTipo.addItem("@Gmail.com");
            correoTipo.addItem("@Yahoo.com");
            correoTipo.addItem("@Protonmail.com");
            correoTipo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(correoTipo);
            
            //la contraseña junto con su campo de confirmacion
            JLabel contraseña = new JLabel("Contraseña:");
            contraseña.setBounds(20,210,80,30);
            contraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(contraseña);
            
            contraseñaIng = new JPasswordField("");
            contraseñaIng.setBounds(100,207,100,30);
            add(contraseñaIng);
            
            JLabel contraseña2 = new JLabel("Confirmar Contraseña:");
            contraseña2.setBounds(20,245,150,30);
            contraseña2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(contraseña2);
            
            contraseña2Ing = new JPasswordField();
            contraseña2Ing.setBounds(170,245,100,30);
            add(contraseña2Ing);
            
            //Todo lo referente a los checkboxes con su label
            JLabel intereses = new JLabel("I N T E R E S E S");
            intereses.setBounds(96,280,140,30);
            intereses.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
            add(intereses);
            
            economia = new JCheckBox("Economia");
            economia.setBounds(10, 316, 90, 30);
            economia.addActionListener(this);
            economia.setOpaque(false);
            economia.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(economia);
            check.add(economia);
            
            tecnologia = new JCheckBox("Tecnologia");
            tecnologia.setBounds(10, 356, 100, 30);
            tecnologia.addActionListener(this);
            tecnologia.setOpaque(false);
            tecnologia.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(tecnologia);
            check.add(tecnologia);
            
            juegos = new JCheckBox("Juegos");
            juegos.setBounds(100, 316, 70, 30);
            juegos.addActionListener(this);
            juegos.setOpaque(false);
            juegos.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(juegos);
            check.add(juegos);
            
            musica = new JCheckBox("Musica");
            musica.setBounds(100, 356, 70, 30);
            musica.addActionListener(this);
            musica.setOpaque(false);
            musica.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(musica);
            check.add(musica);
            
            deportes = new JCheckBox("Deportes");
            deportes.setBounds(170, 316, 95, 30);
            deportes.addActionListener(this);
            deportes.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            deportes.setOpaque(false);
            add(deportes);
            check.add(deportes);
            
            fotografia = new JCheckBox("Fotografia");
            fotografia.setBounds(170, 356, 100, 30);
            fotografia.setOpaque(false);
            fotografia.addActionListener(this);
            fotografia.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
            add(fotografia);
            check.add(fotografia);
            
            //foto de fondo
            JLabel fondo = new JLabel();
            fondo.setIcon(new ImageIcon("fondo.png"));
            fondo.setBounds(0, 0, 770, 510);
            add(fondo);
            
            //todo lo del menu
            barra = new JMenuBar();
            Programa = new JMenu("Menu");
            Creditos = new JMenuItem("Creditos");
            Creditos.addActionListener(this);
            Guardar = new JMenuItem("Guardar");
            Guardar.addActionListener(this);            
            Limpiar = new JMenuItem("Limpiar");
            Limpiar.addActionListener(this);
            Cerrar = new JMenuItem("Cerrar");
            Cerrar.addActionListener(this);
            this.add(barra);
            barra.add(Programa);
            barra.add(Creditos);
            Programa.add(Guardar);
            Programa.add(Limpiar);
            Programa.add(Creditos);
            Programa.add(Cerrar);           
            setJMenuBar(barra);                
        }
        
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == Guardar)  { 
           //valida primero y si es true, realiza la accion
           if (validar()){
            agregarPanel();
            JOptionPane.showMessageDialog(this, "Usuario creado!", "Proceso Completado", JOptionPane.INFORMATION_MESSAGE);
           }
       }
       if (e.getSource() == Cerrar) {
            //cierra el programa con confirmacion
            Object[] options = { "Si", "No", "Cancelar"};
            if (JOptionPane.showOptionDialog(null, "¿Desea salir del programa? ", 
                         "Salida" , //titulo de la ventana
                         JOptionPane.YES_NO_CANCEL_OPTION, 
                         JOptionPane.QUESTION_MESSAGE, //tipo de ícono
                         null,    
                         options,
                         "SO") == 0) {
                System.exit(0);
        }
       }
       if (e.getSource() == Creditos) {
           //parte del menu de autores
            JOptionPane.showMessageDialog(null, 
                """
                Realizado por:
                Enrique Hidalgo
                Walter Raleigh""",
                "Autores",
                JOptionPane.INFORMATION_MESSAGE);
       } 
       if (e.getSource() == Limpiar) {
           //limpia los inputs
           limpiar();
       }
    }
    public void agregarPanel() {
        //limpia el panel
        panelDatos.setText("");
        //elige la opcion del usuario con respecto al genero
        JRadioButton seleccionado = seleccionado();
        String nombres = nombreIng.getText();
        String apellidos = apellidosIng.getText();
        String fecha = ((JTextField)calendario.getDateEditor().getUiComponent()).getText();
        String correoFull = correo1.getText() + correoTipo.getSelectedItem().toString();
        String contraseñaFinal =contraseñaIng.getText();
        //crea el objeto de clase Persona
        Persona personas = new Persona(nombres, apellidos,seleccionado.getText(), 
        fecha, correoFull,contraseñaFinal);
        
        for (JCheckBox checks : check) {
            if (checks.isSelected()){
                //agrega cada uno
                personas.setIntereses(checks.getText());
            }
        }  
        //la agrega al arreglo
        listaPersonas.add(personas);
        String intereses = "";
        
        for (int i = 0; i < listaPersonas.size(); i++) {  
            intereses = listaPersonas.get(i).getIntereses();
            if(intereses.endsWith(" "))
            {
                //para poner el punto al final.
             intereses = intereses.substring(0,intereses.length() - 2) + ".";
            }
        panelDatos.setText(panelDatos.getText() + "Nombre: " + listaPersonas.get(i).getNombre() + "\n" +
                           "Apellidos: " + listaPersonas.get(i).getApellido() + "\n" +
                           "Genero: " + listaPersonas.get(i).getGenero() + "\n" +
                           "Fecha de Nacimiento: " + listaPersonas.get(i).getFecha() + "\n" +
                           "Correo: " + listaPersonas.get(i).getCorreo() + "\n" +
                           "Contraseña: " + listaPersonas.get(i).getContraseña() + "\n" +
                           "Interes/es: " + intereses + "\n");
        panelDatos.setText(panelDatos.getText() + "\n");
        }    
        
    }
    
     public boolean validar() {
         //verifica cada input de arriba para abajo
        if (!isAlpha(nombreIng.getText())) {
            JOptionPane.showMessageDialog(this, "Por favor solo coloque caracteres alfabeticos para el nombre.", "Solo caracteres", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if (nombreIng.getText().trim().length() < 2 || nombreIng.getText().trim().length() > 24 
            || nombreIng.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Coloque entre 3 o 24 caracteres para el nombre.", "No son suficientes", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if (!s1.isSelected() && !s2.isSelected() && !s3.isSelected()){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un genero.", "Seleccionar Genero", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if (!isAlpha(apellidosIng.getText())) {
           JOptionPane.showMessageDialog(this, "Por favor solo coloque caracteres alfabeticos para el apellido.", "Solo caracteres", JOptionPane.WARNING_MESSAGE);
           return false;
        }
        else if (apellidosIng.getText().trim().length() < 2 || apellidosIng.getText().trim().length() > 24 
           || apellidosIng.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "Coloque entre 3 o 24 caracteres para el apellido.", "No son suficientes", JOptionPane.WARNING_MESSAGE);
           return false;
        }
        else if (correo1.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "Por favor rellene el correo", "Rellenar el correo", JOptionPane.WARNING_MESSAGE);
           return false;     
        }
        else if (contraseñaIng.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Coloque entre 3 o 15 caracteres para la contraseña.", "No son suficientes", JOptionPane.WARNING_MESSAGE);
            return false;     
        }
        else if (!contraseñaIng.getText().equals(contraseña2Ing.getText())) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no son iguales.", "No son iguales", JOptionPane.WARNING_MESSAGE);
            return false;     
        }
        else if (((JTextField)calendario.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha.", "Coloque una fecha", JOptionPane.WARNING_MESSAGE);
            return false; 
        }
        return true;
     }
       
     public boolean isAlpha(String input) {
        //expresion regular que chequea si es alfabetico
        return input.matches("[a-zA-Z]+");
    }
     
    public void limpiar() {
        //limpia todos los inputs
        nombreIng.setText("");
        apellidosIng.setText("");
        grupoDeBotones.clearSelection();
        correo1.setText("");
        contraseñaIng.setText("");
        contraseña2Ing.setText(""); 
        panelDatos.setText("");
        for (JCheckBox checks : check) {
             checks.setSelected(false);
        }
    }
    
    public JRadioButton seleccionado() {
        if (s1.isSelected()) {
            return s1;
        } else if (s2.isSelected()) {
            return s2;
        } else {
            return s3;
        }
    }
 }