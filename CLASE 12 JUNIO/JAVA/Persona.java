package JAVA;

public class Persona {
    String nombre;
    String apellido;
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    @Override //es para sobreescribir la ubicacion de me memoria por lo que esta en el toString 
    public String toString(){
        String informacion = "El nombre de la persona es : "+this.nombre+"\ny su apellido "+this.apellido;
        return informacion;
    }
}
