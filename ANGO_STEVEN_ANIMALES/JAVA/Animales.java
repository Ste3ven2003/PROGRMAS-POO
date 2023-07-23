package JAVA;

public class Animales {
    String nombre;
    int edad;
    public Animales(String nombre,int edad) { //constructor
        this.nombre = nombre;
        this.edad = edad;
    }
    public void comer (String especie){// metodo
        System.out.println("El "+especie+ " Esta comiendo");
    }
}
