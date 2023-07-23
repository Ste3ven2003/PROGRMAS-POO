package Presentacion;

public class Main {
    public static void main(String[] args) {
        
        Usuario modelo = new Usuario();
        VistaUsuario vista = new VistaUsuario();
        ControladorUsuario controlador = new ControladorUsuario(modelo, vista);

        
        controlador.actualizarDatosUsuario("Erick Chancusig", "erick-12@gmail.com");

        
        controlador.mostrarDetallesUsuario();
    }
}