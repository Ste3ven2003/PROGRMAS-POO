
package pruebaconjunta;
import PERSONAS.CLIENTES;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PRUEBACONJUNTA {

    public static void main(String[] args) {
        int ordenMenu = 58;
        Scanner entrada = new Scanner(System.in);
        MENU menu1 = new MENU(null,12,1);
        CLIENTES c1 = new CLIENTES(null,0,ordenMenu);
        MESERO M1 = new MESERO("Pablo","mereso");
        COCINERO cook1 = new COCINERO("Jose","Cocinero");
        System.out.println("El cliente llego al restaurante");
        c1.INFO();
        M1.HACER_LA_ORDEN();
        String respuesta = entrada.nextLine();
        if (respuesta.equals("Si")) {
            do{
                System.out.println("=== MENÚ ===");
                System.out.println("Opción 0. Salir.");
                System.out.println("Opción 1 Pedir Desayuno.");
                System.out.println("Opción 2 Pedir Almuerzo.");
                System.out.println("Opción 3 Pedir Merienda.");
                System.out.println("Ingrese el numero de la opcion que quiera");
                try{
                    ordenMenu = entrada.nextInt();
                    switch(ordenMenu){
                    case 1 -> {
                        menu1.TIPO_DE_ALIMENTO = "Desayuno";
                         cook1.HACER_LA_ORDEN();
                        M1.ENTREGAR_ORDEN();
                        }
                    case 2 -> {
                        menu1.TIPO_DE_ALIMENTO = "Almuerzo";
                         cook1.HACER_LA_ORDEN();
                         M1.ENTREGAR_ORDEN();
                        }
                    case 3 -> {
                        menu1.TIPO_DE_ALIMENTO = "Merienda";
                         cook1.HACER_LA_ORDEN();
                        M1.ENTREGAR_ORDEN();
                        }
                    case 0 -> System.out.println("A salido del menu");
                    default -> System.out.println("opcion invalida seleccione una opcion valida");       
                    } 
                    }catch(InputMismatchException e){
                       System.out.println("opcion invalida seleccione una opcion valida");
                       entrada.nextLine();  
                    }
            } while(ordenMenu != 0);
        }else {
            System.out.println("el cliente salió del restaurante");
        }
        
    }
    
}
