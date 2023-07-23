package JAVA3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad ");
        try{
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresa el Nombre");
        String nombre = entrada.nextLine();
        System.out.println(nombre+" y su edad es: "+edad); 
        }catch(InputMismatchException e){
            System.out.println("Ingrese un entero");
        }
        
    }
}
