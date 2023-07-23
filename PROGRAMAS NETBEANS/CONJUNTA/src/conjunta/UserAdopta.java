/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjunta;

import java.util.Scanner;

public class UserAdopta extends Usuario{
    int edad;
    String Direccion;

    public UserAdopta(int edad, String Direccion, String nombre) {
        super(nombre);
        this.edad = edad;
        this.Direccion = Direccion;
    }
      public void Datos (){
        System.out.println("----------------------------");
        System.out.println("Datos ingresados UserAdopta");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edad);
        System.out.println("DIRECCION: "+Direccion);
    }
    public void INFO(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ingresa el nombre del Adoptador");
        nombre = entrada.nextLine();
        System.out.println("Ingresa la edad del adoptador");
        edad = entrada.nextInt();
        System.out.println("Ingresa la direccion del adoptador");
        Direccion = entrada.nextLine();
        entrada.nextLine();
    }
}
