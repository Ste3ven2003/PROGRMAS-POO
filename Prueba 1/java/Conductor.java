package java;
class Conductor extends Persona {
    String licencia;
    public Conductor(int id,String nombre,String licencia){
        super(id,nombre);
        this.licencia = licencia;
    }
    public void confirmacion_del_vehiculo(String conf){
        System.out.println("El conductor "+conf+ " acepto el viaje.");
    }
}
