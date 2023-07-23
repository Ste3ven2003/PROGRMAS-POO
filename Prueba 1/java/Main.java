package java;
public class Main {
    public static void main(String[] args) {
        Persona per1= new Persona(1,"Steven");
        Persona per2= new Persona(7,"Juan");
        System.out.println("nombre: "+per1.nombre);
        Usuario usuario1 = new Usuario(1,"Steven",20);
        Conductor conductor1 = new Conductor(7,"Juan","Si");
        System.out.println("Edad: "+per1.nombre);
        System.out.println("El nombre del usuario es: "+usuario1.nombre+" su id es: "+usuario1.id+" y su edad es: "+usuario1.edad);
        per1.comer("Si","Usuario");
        usuario1.llegada_del_vehiculo("Aun no a llegado");
        System.out.println("nombre: "+per2.nombre);
        System.out.println("---------------------------------------------------");
        System.out.println("El conductor es "+conductor1.nombre+" su id es "+conductor1+" y "+conductor1.licencia+" tiene licencia");
        per2.comer("Si","conductor");
        conductor1.confirmacion_del_vehiculo("Si");
    }
}