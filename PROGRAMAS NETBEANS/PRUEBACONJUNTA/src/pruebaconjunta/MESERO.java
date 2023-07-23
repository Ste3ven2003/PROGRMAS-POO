/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaconjunta;

public class MESERO extends TRABAJADORES {
        private String usuario = "mesero2003";
    public MESERO(String nombre, String rol) {
        super(nombre, rol);
    }
    public void HACER_LA_ORDEN(){
        System.out.println("!Hola soy "+nombre+", soy su "+rol+"! ¡Puedo tomar su orden!");
    }
    public void ENTREGAR_ORDEN(){
        System.out.println("El mesero "+nombre+", está llevando su orden! ¡provecho! ¡Y gracias por comer en nuestro restaurante!");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
