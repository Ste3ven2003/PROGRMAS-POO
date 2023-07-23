package JAVA;

public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona(1714979182,"Steven");
        Persona per2 = new Persona(1722786413,"Juan");
        System.out.println("USUARIO: "+per1.nombre);
        Usuario user1 = new Usuario(1714979182,"Steven", 20);
        System.out.println("El nombre del usuario es: "+user1.nombre+" su id es: "+user1.id+" y su edad es: "+user1.edad);
        per1.comer("Si", "Usuario");
        user1.llegada_del_vehiculo("Aun no ha llegado");

        System.out.println("CONDUCTOR: "+per2.nombre);
        Conductor cont1 = new Conductor(1722786413,"Juan", "Si");
        System.out.println("El nombre del usuario es: "+cont1.nombre+" su id es: "+cont1.id+" y su edad es: "+cont1.licencia);
        per2.comer("No", "Conductor");
        cont1.confirmacion_del_viaje("Si");

    }
    
}
