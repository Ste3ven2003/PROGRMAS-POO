package RECUPERACION;

class Mecanico extends Persona {
    private String etnia;

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public Mecanico(String nombre, int id) {
        super(nombre, id);
    }

}
