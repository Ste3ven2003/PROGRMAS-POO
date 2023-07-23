package JAVA;
public class Contador_Tickets {
    int contador = 0;
    int numero;
    String fecha_compra;
    String DNIpersona;
    public Contador_Tickets( String fecha_compra, String DNIpersona) {
        contador ++;
        this.contador = contador;
        this.numero = numero;
        this.fecha_compra = fecha_compra;
        this.DNIpersona = DNIpersona;
    }
    public String toString(){
        return "ticket{"+"numero"+this.numero+",Fecha de compra: "+this.fecha_compra+" , DNIpersona"+this.DNIpersona+"}";
    }
}