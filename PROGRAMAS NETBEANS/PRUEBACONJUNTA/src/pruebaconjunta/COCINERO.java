/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaconjunta;
public class COCINERO extends TRABAJADORES {
        private String usuario ="Cook12";
    public COCINERO(String nombre, String rol) {
        super(nombre, rol);
    }
    public void HACER_LA_ORDEN(){
        System.out.println("El cocinero "+nombre+"se encuentra prepoarando su orden");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
