import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class map {
    public static void main(String[] args) {
        Map diccionario = new HashMap();
        diccionario.put("apellido","Jaramillo");
        diccionario.put("nombre","luis");
        diccionario.put("edad",32);

        System.out.println(diccionario);
        System.out.println(diccionario.get("nombre"));
        //System.out.println(diccionario.get("apellido"));
        
        for (Object valor : diccionario.values()) {
            System.out.println(valor);
        }

        for (Object llave : diccionario.keySet()) {
            System.out.println(llave);
        }

        diccionario.remove("apellido");
        System.out.println(diccionario);

        diccionario.clear();
        System.out.println(diccionario);



    }
    
}
