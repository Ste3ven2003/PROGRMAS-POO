import javax.xml.transform.Source;
import java.util.*;

public class persistencia {
    public static void main(String[] args) {
        List lista1 = new ArrayList();
        lista1.add("luis");//almacena objetos.
        lista1.add(32);
        lista1.add(true);
        System.out.println(lista1);
        System.out.println(lista1.get(1));
        for (Object dato : lista1) {
            System.out.println(dato);
        }
        //lista1.remove(0); //eliminar un dato de la lista.
        //System.out.println(lista1);

        lista1.set(0, "luis Enrique");
        System.out.println(lista1);

        lista1.clear();
        System.out.println(lista1);

    }
    
}
