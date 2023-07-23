package JAVA;

public class Animales {
    protected String nombre;
    protected int edad;
    public Animales(String nombre,int edad) { //constructor
        this.nombre = nombre;
        this.edad = edad;
    }
    public void comer (String especie){// metodo
        System.out.println("El "+especie+ " Esta comiendo");
    }
}
