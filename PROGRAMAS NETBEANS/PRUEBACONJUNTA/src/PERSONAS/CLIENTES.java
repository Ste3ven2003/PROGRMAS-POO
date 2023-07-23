/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERSONAS;

import java.util.Scanner;

public class CLIENTES {
    String nombre;
    int mesa;
    int orden;

    public CLIENTES(String nombre, int mesa, int orden) {
        this.nombre = nombre;
        this.mesa = mesa;
        this.orden = orden;
    }
public void INFO(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("Ingresa el nombre del Cliente");
    nombre = entrada.nextLine();
    System.out.println("Ingresa la mesa del cliente");
    mesa = entrada.nextInt();
}
public void orden (){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese su orden");
    orden = entrada.nextInt();
} 
}

