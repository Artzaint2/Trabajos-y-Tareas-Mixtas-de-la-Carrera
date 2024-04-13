package formulario;

import java.util.ArrayList;

public class Persona {
    String nombre;
    String apellido; 
    String genero; 
    String fecha; 
    String correo; 
    String contraseña;
    ArrayList<String> intereses;

    public Persona(String nombre, String apellido, String genero, String fecha, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fecha = fecha;
        this.correo = correo;
        this.contraseña = contraseña;
        this.intereses = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
     public void setIntereses(String interes) {
        this.intereses.add(interes);
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public String getIntereses() {
        String interes = "";
        if (intereses.size() < 1) {
            return "No tiene intereses";
        }
        for (String interes1 : intereses) {
            interes += interes1 + ", ";
        }
        return interes;
    }
}
