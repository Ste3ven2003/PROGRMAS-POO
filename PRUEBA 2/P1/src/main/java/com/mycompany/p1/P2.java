/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1;
import mascotas.Animales;
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------");
        String nombreFuncionario, usuarioFuncionario, emailFuncionario,etniaFuncionario;
        System.out.println("Ingresa el nombre del funcionario");
        nombreFuncionario = entrada.nextLine();
        System.out.println("Ingresa el usuario del funcionario");
        usuarioFuncionario = entrada.nextLine();
        System.out.println("Ingresa el email del funcionario");
        emailFuncionario = entrada.nextLine();
        System.out.println("Ingresa La etnia del Funcionario");
        etniaFuncionario = entrada.nextLine();
        Funcionario fun1 = new Funcionario(usuarioFuncionario,emailFuncionario, etniaFuncionario ,nombreFuncionario );
        
        System.out.println("-----------------------------------------------------------------------");
        String nombreAdoptador,direccionAdoptador;
        int edadAdoptador;
        System.out.println("Ingresa el nombre del Adoptador");
        nombreAdoptador = entrada.nextLine();
        System.out.println("Ingresa la edad del adoptador");
        edadAdoptador = entrada.nextInt();
        System.out.println("Ingresa la direccion del adoptador");
        direccionAdoptador = entrada.nextLine();
        entrada.nextLine();
        UserAdopta adop1 = new UserAdopta(edadAdoptador,direccionAdoptador,nombreAdoptador);
        
        System.out.println("-----------------------------------------------------------------------");
        int edadAnimales;
        String nnombreAnimales;
        String specieAnimales;
        System.out.println("Ingresa el nombre de la Mascota");
        nnombreAnimales = entrada.nextLine();
        System.out.println("Ingresa la Edad");
        edadAnimales = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresa la especie");
        specieAnimales = entrada.nextLine();
        Animales animal1 = new Animales(nnombreAnimales, edadAnimales, specieAnimales);
        System.out.println("-----------------------------------------------------------------------");
        fun1.Datos();
        fun1.RESPIRAR(nombreFuncionario);
        adop1.INFO2();
        adop1.RESPIRAR(nombreAdoptador);
        animal1.INFO();
        animal1.ACCION(specieAnimales);
        animal1.ESTADO(specieAnimales);
    }
}
