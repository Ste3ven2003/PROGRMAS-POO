/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1;
public class UserAdopta extends Usuario{
    int edad;
    String Direccion;

    public UserAdopta(int edad, String Direccion, String nombre) {
        super(nombre);
        this.edad = edad;
        this.Direccion = Direccion;
    }
      public void INFO2 (){
        System.out.println("----------------------------");
        System.out.println("Datos ingresados");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edad);
        System.out.println("DIRECCION: "+Direccion);
    }
    
}
