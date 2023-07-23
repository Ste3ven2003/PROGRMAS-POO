package JAVA;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Ramon",5,"delmer");//Creamos un onjeto Perro con sus atributos
        Gato cat1 = new Gato("tito", 1, "Macho");//Creamos un onjeto Gato con sus atributos
        Loro loro1 = new Loro("Pepe", 2,"Rojo");
        Conejo conejo1 = new Conejo("Pou", 2, 35.5);
        System.out.println("El animal 1 es: " +perro1.nombre);
        System.out.println("La edad del perro es: "+perro1.edad+" años y su raza es: "+perro1.raza);
        perro1.comer("Perro");// Hacemos un llamado a nuestro metodo
        System.out.println("El animal 2 es: " +cat1.nombre);
        System.out.println("La edad del gato es de: "+cat1.edad+" años y su genero es: "+cat1.genero);
        cat1.comer("Gato");//Hacemos un llamado a nuetro metodo comer
        System.out.println("El animal 3 es: " +loro1.nombre);
        System.out.println("La edad del loro es de: "+loro1.edad+" años y su color es: "+loro1.color);
        loro1.comer("Loro");
        System.out.println("El animal 4 es: " +conejo1.nombre);
        System.out.println("La edad del Conejo es de: "+loro1.edad+" años y su altura es de : "+conejo1.altura+" cm.");
        conejo1.comer("Conejo");
    }
}