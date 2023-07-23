/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1;

/**
 *
 * @author HP
 */
public class Funcionario extends Usuario {
    String usuario;
    String email;
    String etnia;

    public Funcionario(String usuario, String email, String etnia, String nombre) {
        super(nombre);
        this.usuario = usuario;
        this.email = email;
        this.etnia = etnia;
    }

    public void Datos (){
        System.out.println("----------------------------");
        System.out.println("Datos ingresados");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("USUARIO: "+usuario);
        System.out.println("EMAIL "+email);
        System.out.println("ETNIA "+etnia);
    }
    
    
}
