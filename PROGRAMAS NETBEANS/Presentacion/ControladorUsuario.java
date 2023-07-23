package Presentacion;

public class ControladorUsuario {
    public Usuario modelo;
    public VistaUsuario vista;

    public ControladorUsuario(Usuario modelo, VistaUsuario vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarDatosUsuario(String nombre, String correo) {
        modelo.nombre = nombre;
        modelo.correo = correo;
    }

    public void mostrarDetallesUsuario() {
        String nombre = modelo.nombre;
        String correo = modelo.correo;
        vista.mostrarDetallesUsuario(nombre, correo);
    }
}