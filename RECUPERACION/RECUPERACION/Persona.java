package RECUPERACION;

public class Persona {
    String nombre;
    int id;
    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    public void ESTATUS() {
        System.out.println(": "+nombre+" esta bien ");
    }
}
