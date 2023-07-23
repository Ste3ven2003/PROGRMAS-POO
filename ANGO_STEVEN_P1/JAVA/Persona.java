package JAVA;

public class Persona {
    int id;
    String nombre;
    public Persona(int id,String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    public void comer (String estado,String quien){
        System.out.println("El "+quien+" "+estado+ " esta comiendo");
    }
}
