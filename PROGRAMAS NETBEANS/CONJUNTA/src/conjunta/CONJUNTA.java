package conjunta;
import java.util.InputMismatchException;
import mascotas.Animales;
import java.util.Scanner;

public class CONJUNTA{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int respuesta = 0; 
        Funcionario fun1 = new Funcionario(null,null, null ,null);
        UserAdopta adop1 = new UserAdopta(0,null, null);
        Animales animal1 = new Animales(null,0,null);
        do{
            System.out.println("=== MENÚ ===");
            System.out.println("1 Funcionario");
            System.out.println("2 UsuarioAdopta");
            System.out.println("3 Mascota");
            System.out.println("4. Imprimir los datos ingresados");
            System.out.println("Ingrese el numero de la opcion que quiera");
            try{
            respuesta=entrada.nextInt();
        switch(respuesta){
            case 1 -> {
                entrada.nextLine();
                fun1.Info();
                }
            case 2 -> {
                entrada.nextLine();
                adop1.INFO();
                }
            case 3 -> {
                entrada.nextLine();
                animal1.Info();
                }
            case 4 -> System.out.println("La informacion ingresada fue");
            default -> System.out.println("opcion invalida seleccione una opcion valida");       
        }
        }catch(InputMismatchException e){
                System.out.println("opcion invalida seleccione una opcion valida");
               entrada.nextLine();
            }
           System.out.println();
        }while(respuesta !=4);
    fun1.Datos();
    fun1.RESPIRAR();
    
    adop1.Datos();
    adop1.RESPIRAR();
    
    animal1.Datos();
    animal1.ACCION();
    animal1.ESTADO();
    }
    
}
