package PRINCIPAL;
import java.util.Scanner;
public class Persona {
    int edad;
    String nombre;
    public Persona(int edad,String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
    public void correr(){
        System.out.println("La persona esta corriendo");
    }
    public void IngresarDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresa el Nombre");
        String nombre = entrada.nextLine();
        System.out.println("Su nombre es: "+nombre+" y su edad es: "+edad);
    }
}
