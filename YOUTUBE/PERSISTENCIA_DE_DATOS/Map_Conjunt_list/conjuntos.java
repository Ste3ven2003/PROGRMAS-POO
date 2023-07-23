import java.util.HashSet;

public class conjuntos {
    public static void main(String[] args) {
        HashSet dias = new HashSet(); //para crear conjuntos
        dias.add ("lunes");
        dias.add ("martes");
        dias.add("miercoles");
        dias.add("miercoles"); //este tipo de conjuntos no repite datos repetidos. y no respeta el orden.
        dias.add("jueves");
        dias.add("viernes");

        for (Object datos : dias) {
            System.out.println(datos);
            
        }

        System.out.println(dias);


        dias.remove("lunes"); //para eliminar un elemento del conjunto
        System.out.println(dias);

        dias.clear(); //para eliminar todos los elementos.
        System.out.println(dias);
    }
    
}
