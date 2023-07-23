
package reinas_graficas;
public class Usuario {
    private String usuario= "Admin";
    private String password = "123";
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void MENU(){
        System.out.println("MENU");
        System.out.println("1 CALIFICAR");
        System.out.println("2 VER INFORMACION");
    }
    public Usuario() {
    }
    public boolean miFuncion(String usuario2, String password2) {
         if (usuario2.equals(usuario) && password2.equals(password)) { 
            return true; 
        }else { 
            return false;
        } 
    }
}
