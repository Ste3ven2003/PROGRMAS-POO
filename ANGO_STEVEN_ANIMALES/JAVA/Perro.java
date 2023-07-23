package JAVA;

class Perro extends Animales{// indicamos que la clase Perro es extencion de  la Clase animales
    String raza;
    public Perro(String nombre,int edad,String raza){//Creamos un contructor
        super(nombre,edad);
        this.raza = raza;
    }  
}