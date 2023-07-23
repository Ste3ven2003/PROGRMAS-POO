package RECUPERACION;

class Acesor extends Persona{
    private int numeroDelTrabajador;

    public int getNumeroDelTrabajador() {
        return numeroDelTrabajador;
    }

    public void setNumeroDelTrabajador(int numeroDelTrabajador) {
        this.numeroDelTrabajador = numeroDelTrabajador;
    }

    public Acesor(String nombre, int id) {
        super(nombre, id);
    }
}
