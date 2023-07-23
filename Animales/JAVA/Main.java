package JAVA;
public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("perro",1,"Dalmata");
        Gato gato1 = new Gato("Gato",1,null);
        gato1.setNombre("Bola de nieve");
        gato1.setEdad(1);
        perro1.setNombre("Dante");
        perro1.setEdad(1);
        System.out.println("NOMBRE: "+perro1.getNombre());
        System.out.println("La edad es: "+perro1.getEdad()+" año La raza del perro es: "+perro1.raza);
        perro1.comer("Perro");

        System.out.println("NOMBRE: "+gato1.getNombre());
        System.out.println("La edad es: "+gato1.getEdad()+" año El genero del gato es: "+gato1.genero);
        gato1.comer("Gato");
        
        
    }

}
