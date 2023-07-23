package clasearraya;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        String dato_perro1= perro1.datos_perro("rocky", "pastor alemán");
        String dato_perro2= perro2.datos_perro("boby", "bulldog inglés");
        
        ArrayList <String> perros = new ArrayList<String>();
         perros.add(dato_perro1);
         perros.add(dato_perro2);

         for (int i = 0; i < perros.size(); i++) {
            System.out.println(perros.get(i));
        }
    }
}
