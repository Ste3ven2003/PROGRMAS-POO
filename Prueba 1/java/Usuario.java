package java;

class Usuario extends Persona {
    int edad;
    public Usuario(int id,String nombre,int edad){
        super(id,nombre);
        this.edad = edad;
    }
    public void llegada_del_vehiculo(String estado){
        System.out.println("El vehiculo "+estado);
    }
}

