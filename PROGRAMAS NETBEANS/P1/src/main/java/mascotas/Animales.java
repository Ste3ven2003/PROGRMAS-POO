/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotas;
public class Animales {
    private String nombre;
    private int edad;
    private String specie;

    public Animales(String nombre, int edad, String specie) {
        this.nombre = nombre;
        this.edad = edad;
        this.specie = specie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
    public void ESTADO(String especie){
        System.out.println("El "+especie+" Esta tomando agua ");
    }
    public void ACCION(String especie){
        System.out.println("El "+especie+" Sera Adoptado");
    }
    
    public void INFO (){
        System.out.println("----------------------------");
        System.out.println("Datos ingresados");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edad);
        System.out.println("ESPECIE "+specie);
    }
    

    
}
