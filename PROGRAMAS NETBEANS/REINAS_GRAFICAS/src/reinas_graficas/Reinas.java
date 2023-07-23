
package reinas_graficas;
public class Reinas {
    int Inteligencia;
    int Belleza;
    public String datos_reinas(int Belleza,int Inteligencia){
    String mensaje_reina ="- Belleza: " + Belleza + "\nInteligencia: "+Inteligencia;
    return mensaje_reina;
}
public void calificacion(){
    System.out.println("---------------------------");
    System.out.println("Elije la reina a calificar");
    System.out.println("1 REINA #1");
    System.out.println("2 REINA #2");
    System.out.println("3 REINA #3");
    System.out.println("4 SALIR DEL LISTADO DE REINAS ");
}
}
