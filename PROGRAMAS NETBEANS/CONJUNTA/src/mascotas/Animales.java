package mascotas;

import java.util.InputMismatchException;
import java.util.Scanner;

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
    public void ESTADO(){
        System.out.println("El "+specie+" Esta tomando agua ");
    }
    public void ACCION(){
        System.out.println("El "+specie+" Sera Adoptado");
    }
    
    public void Datos (){
        System.out.println("----------------------------");
        System.out.println("Datos ingresados Animales");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edad);
        System.out.println("ESPECIE "+specie);
    }
    public void Info (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ingresa el nombre de la Mascota");
        nombre = entrada.nextLine();
        do{
        try{
        System.out.println("Ingresa la Edad");
        edad = entrada.nextInt();
        }catch(InputMismatchException e){
               System.out.println("Escribir tu edad en numeros");
               entrada.nextLine();
        }
        }while(edad <= 0);
        entrada.nextLine();
        System.out.println("Ingresa la especie");
        specie = entrada.nextLine();
    }
    

    
}