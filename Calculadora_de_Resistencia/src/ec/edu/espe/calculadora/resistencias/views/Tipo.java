package ec.edu.espe.calculadora.resistencias.views;

public enum Tipo {
   
   PARALELO("Paralelo"),
   SERIE("Serie"),
   
   DELTA_ESTRELLA("Delta a Estrella"),
   
   ESTRELLA_DELTA("Estrella a Delta");
   
   private final String tipo;
   
   Tipo(String tipo) {
       this.tipo = tipo;
   }
   
   public String getTipo() {
       return tipo;
   }
   
}
