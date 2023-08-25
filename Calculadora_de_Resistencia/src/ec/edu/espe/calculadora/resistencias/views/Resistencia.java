package ec.edu.espe.calculadora.resistencias.views;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;


public class Resistencia implements Calcular {
   
   public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");
   
   
   @Override
   public double calcularResistenciasParalelo(List<Double> resistencias) {
      double resultado = 0;
      for(Double resistencia : resistencias) {
         resultado += 1 / resistencia;
      }
      return 1 / resultado;
   }
   
   @Override
   public double calcularResistenciasSerie(List<Double> resistencias) {
      double resultado = 0;
      for(Double resistencia : resistencias) {
         resultado += resistencia;
      }
      return resultado;
   }
   
   @Override
   public double calcularDeltaEstrellaR1(List<Double> resistencias) {
      
      double numerador = resistencias.get(1) * resistencias.get(2);
      
      return numerador / obtenerDenominadorDeltaEstrella(resistencias);
   }
   
   @Override
   public double calcularDeltaEstrellaR2(List<Double> resistencias) {
      
      double numerador = resistencias.get(0) * resistencias.get(2);
      
      return numerador / obtenerDenominadorDeltaEstrella(resistencias);
      
   }
   
   @Override
   public double calcularDeltaEstrellaR3(List<Double> resistencias) {
      
      double numerador = resistencias.get(1) * resistencias.get(2);
      
      return numerador / obtenerDenominadorDeltaEstrella(resistencias);
      
   }
   @Override
   public double obtenerDenominadorDeltaEstrella(List<Double> resistencias) {
      return resistencias.get(0) + resistencias.get(1) + resistencias.get(2);
   }
   
   @Override
   public double calcularEstrellaDeltaRA(List<Double> resistencias) {
      return obtenerNumeradorEstrellaDelta(resistencias) / resistencias.get(0);
   }
   
   @Override
   public double calcularEstrellaDeltaRB(List<Double> resistencias) {
      return obtenerNumeradorEstrellaDelta(resistencias) / resistencias.get(1);
   }
   
   @Override
   public double calcularEstrellaDeltaRC(List<Double> resistencias) {
      return obtenerNumeradorEstrellaDelta(resistencias) / resistencias.get(2);
   }
   
   @Override
   public double obtenerNumeradorEstrellaDelta(List<Double> resistencias) {
      return resistencias.get(0) * resistencias.get(1) + resistencias.get(1) * resistencias.get(2) + resistencias.get(
         0) * resistencias.get(2);
   }
   
   @Override
   public String formulaDeltaEstrella(List<Double> resistencias) {
      String formula = """
                                 Rb  * Rc
                       R1 =  --------------- = r u
                               (Ra + Rb + Rc)
                             
                       """;
      
      String formulaRemplazada = formula
         .replace("Ra", DECIMAL_FORMAT.format(resistencias.get(0)))
         .replace("Rb", DECIMAL_FORMAT.format(resistencias.get(1)))
         .replace("Rc", DECIMAL_FORMAT.format(resistencias.get(2)))
         .replace("r", DECIMAL_FORMAT.format(calcularDeltaEstrellaR1(resistencias)))
         .replace("u", "Ω");
      
      String formula2 = """
                                   Ra * Rc
                        R2 =   --------------- = r u
                               (Ra + Rb + Rc)
                             
                        """;
      String formulaRemplazada2 = formula2
         .replace("Ra", DECIMAL_FORMAT.format(resistencias.get(0)))
         .replace("Rb", DECIMAL_FORMAT.format(resistencias.get(1)))
         .replace("Rc", DECIMAL_FORMAT.format(resistencias.get(2)))
         .replace("r", DECIMAL_FORMAT.format(calcularDeltaEstrellaR2(resistencias)))
         .replace("u", "Ω");;
      
      String formula3 = """
                                   Ra * Rb
                        R3 =  --------------  = r u
                               (Ra + Rb + Rc)
                             
                        """;
      String formulaRemplazada3 = formula3
         .replace("Ra", DECIMAL_FORMAT.format(resistencias.get(0)))
         .replace("Rb", DECIMAL_FORMAT.format(resistencias.get(1)))
         .replace("Rc", DECIMAL_FORMAT.format(resistencias.get(2)))
         .replace("r", DECIMAL_FORMAT.format(calcularDeltaEstrellaR3(resistencias)))
         .replace("u", "Ω");;
      
      return formula + " " + formulaRemplazada + " " + formula2 + " " + formulaRemplazada2 + " " + formula3 +
             " " + formulaRemplazada3;
   }
   
   
   @Override
   public String formulaEstrellaDelta(List<Double> resistencias) {
      
      String formula = """
                                  R1 * R2 + R2 * R3 + R3 * R1
                       Ra = ----------------------------------------------- = r u
                                             R1
                       
                       """;
      String formulaRemplazada = formula
         .replace("R1", DECIMAL_FORMAT.format(resistencias.get(0)))
         .replace("R2", DECIMAL_FORMAT.format(resistencias.get(1)))
         .replace("R3", DECIMAL_FORMAT.format(resistencias.get(2)))
         .replace("r", DECIMAL_FORMAT.format(calcularEstrellaDeltaRA(resistencias)))
         .replace("u", "Ω");
      
      String formula2 = """
                                    R1 * R2 + R2 * R3 + R3 * R1
                        Rb =  ----------------------------------------------  = r u
                                              R2
                                            
                        """;
      
      String formulaRemplazada2 = formula2
         .replace("R1", DECIMAL_FORMAT.format(resistencias.get(0)))
         .replace("R2", DECIMAL_FORMAT.format(resistencias.get(1)))
         .replace("R3", DECIMAL_FORMAT.format(resistencias.get(2)))
         .replace("r", DECIMAL_FORMAT.format(calcularEstrellaDeltaRB(resistencias)))
         .replace("u", "Ω");
      
      String formula3 = """
                                  R1 * R2 + R2 * R3 + R3 * R1
                        Rc = ---------------------------------------------- = r u
                                             R3
                                             
                        """;
      String formulaRemplazada3 = formula3
         .replace("R1", DECIMAL_FORMAT.format(resistencias.get(0)))
         .replace("R2", DECIMAL_FORMAT.format(resistencias.get(1)))
         .replace("R3", DECIMAL_FORMAT.format(resistencias.get(2)))
         .replace("r", DECIMAL_FORMAT.format(calcularEstrellaDeltaRC(resistencias)))
         .replace("u", "Ω");
      
      return formula +" "+  formulaRemplazada + " " + formula2 + " " + formulaRemplazada2 + " " + formula3 +
             " " + formulaRemplazada3 + " ";
   }
   
}
