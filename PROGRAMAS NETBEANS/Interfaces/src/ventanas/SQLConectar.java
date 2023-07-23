
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;


public class SQLConectar {
    Connection SQLConexion;
    
    public SQLConectar(){
        
        //Ruta URL Base de Datos
        String host = "localhost";
        String puerto = "3306";
        String nameDB = "reinas";
        
        //Acceder URL 
        String usuario = "root";
        String pass = "";
        
        //Driver
        String driver = "com.mysql.cj.jdbc.Driver";
        
        //Contruir URL
        String databaseURL = "jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL=false";
        
        try{
            Class.forName(driver);
            SQLConexion = DriverManager.getConnection(databaseURL,usuario,pass);
            System.out.println("Base de datos conectada");
            
        }catch(Exception ex){
            
    }
    }
    
    
    public Connection getConectarDB(){
        return SQLConexion;
    }
    
}
