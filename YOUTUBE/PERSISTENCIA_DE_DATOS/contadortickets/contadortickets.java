package contadortickets;

public class contadortickets {
    static int contador = 0;
    int numero;
    String fecha_compra;
    String DNIPersona;
    
    public contadortickets(String fecha_compra, String DNIPersona){
        contador ++; //contador = contador +1
        this.numero = contador;
        this.fecha_compra = fecha_compra;
        this.DNIPersona = DNIPersona;
    }
    @Override
    public String toString(){
        
        return;
    }
}
