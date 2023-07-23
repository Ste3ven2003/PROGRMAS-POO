package SwitchCase;
import java.util.Scanner;
public class Principal {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
        System.out.print("Ingrese una opción (1-4): ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste la opción 1.");
                break;
            case 2:
                System.out.println("Seleccionaste la opción 2.");
                break;
            case 3:
                System.out.println("Seleccionaste la opción 3.");
                break;
            case 4:
                System.out.println("Salio del programa");
            break;
            default:
                System.out.println("Opción inválida.");
        }
    }while(opcion!=4);
    }
 }  
