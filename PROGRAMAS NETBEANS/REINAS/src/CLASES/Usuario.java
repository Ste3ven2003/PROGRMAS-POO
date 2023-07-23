
package CLASES;
public class Usuario {
    private String usuario1= "Admin";
    private String password1 = "123";
    private String usuario2= "Seango";
    private String password2 = "2003";
    private String usuario3= "Leidi";
    private String password3 = "1234";
    public boolean miFuncion(String usuario_2, String password_2) {
         if ((usuario_2.equals(usuario1) && password_2.equals(password1))||(usuario_2.equals(usuario2) && password_2.equals(password2))||(usuario_2.equals(usuario3) && password_2.equals(password3))) { 
            return true; 
        }else { 
            return false;
        } 
    }
}
