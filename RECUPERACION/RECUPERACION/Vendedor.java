package RECUPERACION;

class Vendedor extends Persona {
    private int ventas;
    public int getVentas() {
        return ventas;
    }
    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    public Vendedor(String nombre, int id) {
        super(nombre, id);
    }
}
