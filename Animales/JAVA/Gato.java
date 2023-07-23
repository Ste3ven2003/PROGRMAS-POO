package JAVA;

class Gato extends Animales{
    String genero;
    public Gato(String nombre,int edad,String genero){
        super(nombre, edad);
        this.genero = genero;
    } 
}
