package JAVA;

class Conductor extends Persona {
    String licencia;
    public Conductor(int id,String nombre,String licencia){
        super(id,nombre);
        this.licencia = licencia;
    }
    public void confirmacion_del_viaje(String conf){
        System.out.println("El conductor "+conf+ " acepto el viaje.");
    }
}