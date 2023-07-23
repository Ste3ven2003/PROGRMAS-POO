package Arraylist;

public class Persona {
    String nombre;
    String apellido;
    /*public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }*/
    public String dato_persona(String nombre,String apellido){
        String mensaje_persona="El nombre de la persona es: "+nombre+"\nY su apellido es: "+apellido;
        return mensaje_persona;
    }
}
