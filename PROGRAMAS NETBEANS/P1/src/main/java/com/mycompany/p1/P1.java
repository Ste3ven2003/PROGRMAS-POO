/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1;
import java.util.InputMismatchException;
import mascotas.Animales;
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int respuesta = 0;
        String nombreFuncionario, usuarioFuncionario, emailFuncionario,etniaFuncionario;
        String nombreAdoptador,direccionAdoptador;
        int edadAnimales;
        String nnombreAnimales, specieAnimales;
        int edadAdoptador = 0;
        do{
            System.out.println("=== MENÚ ===");
            System.out.println("1 Funcionario");
            System.out.println("2 UsuarioAdopta");
            System.out.println("3 Mascota");
            System.out.println("4. Salir");
            System.out.println("Ingrese el numero de la opcion que quiera");
            try{
            respuesta=entrada.nextInt();
        switch(respuesta){
            case 1 -> {
                entrada.nextLine();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Ingresa el nombre del funcionario");
                nombreFuncionario = entrada.nextLine();
                System.out.println("Ingresa el usuario del funcionario");
                usuarioFuncionario = entrada.nextLine();
                System.out.println("Ingresa el email del funcionario");
                emailFuncionario = entrada.nextLine();
                System.out.println("Ingresa La etnia del Funcionario");
                etniaFuncionario = entrada.nextLine();
                Funcionario fun1 = new Funcionario(usuarioFuncionario,emailFuncionario, etniaFuncionario ,nombreFuncionario );
                fun1.Datos();
                fun1.RESPIRAR(nombreFuncionario);
                }
            case 2 -> {
                entrada.nextLine();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Ingresa el nombre del Adoptador");
                nombreAdoptador = entrada.nextLine();
                System.out.println("Ingresa la edad del adoptador");
                edadAdoptador = entrada.nextInt();
                System.out.println("Ingresa la direccion del adoptador");
                direccionAdoptador = entrada.nextLine();
                entrada.nextLine();
                UserAdopta adop1 = new UserAdopta(edadAdoptador,direccionAdoptador,nombreAdoptador); 
                adop1.INFO2();
                adop1.RESPIRAR(nombreAdoptador);
                }
            case 3 -> {
                entrada.nextLine();
                Animales animal1 = new Animales(null,0,null);
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Ingresa el nombre de la Mascota");
                nnombreAnimales = entrada.nextLine();
                animal1.setNombre(nnombreAnimales);
                System.out.println("Ingresa la Edad");
                edadAnimales = entrada.nextInt();
                animal1.setEdad(edadAnimales);
                entrada.nextLine();
                System.out.println("Ingresa la especie");
                specieAnimales = entrada.nextLine();
                animal1.setSpecie(specieAnimales);
                animal1.INFO();
                animal1.ACCION(specieAnimales);
                animal1.ESTADO(specieAnimales);
                }
            case 4 -> System.out.println("Usted ha salido del programa");
            default -> System.out.println("opcion invalida seleccione una opcion valida");       
        }
        }catch(InputMismatchException e){
                System.out.println("opcion invalida seleccione una opcion valida");
                entrada.nextLine();
            }
            System.out.println();
        }while(respuesta !=4);
    }
}
