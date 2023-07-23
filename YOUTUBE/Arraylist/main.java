package Arraylist;

import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        /*Persona persona1 = new Persona("User", "Login");
        System.out.println("El nombre de la persona es: "+persona1.nombre+"\nY su apellido es: "+persona1.apellido);*/
        Persona person1 = new Persona();
        Persona person2 = new Persona();
        String dato_persona1 =  person1.dato_persona("User","Login");
        String dato_persona2 =  person2.dato_persona("Pedro","Lago");
        ArrayList <String>  Persona = new ArrayList<String>();
            Persona.add(dato_persona1);
            Persona.add(dato_persona2);
            for (int i = 0; i < Persona.size(); i++){
                System.out.println(Persona.get(i));
            }
    }
}