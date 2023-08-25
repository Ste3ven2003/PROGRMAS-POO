
package ec.edu.espe.calculadora.resistencias.views;

import java.util.List;

public interface Calcular {
    
    double calcularResistenciasParalelo(List<Double> resistencias);
    
    double calcularResistenciasSerie(List<Double> resistencias);
    
    double calcularDeltaEstrellaR1(List<Double> resistencias);
    
    double calcularDeltaEstrellaR2(List<Double> resistencias);
    
    double calcularDeltaEstrellaR3(List<Double> resistencias);
    
    double obtenerDenominadorDeltaEstrella(List<Double> resistencias);
    
    double calcularEstrellaDeltaRA(List<Double> resistencias);
    
    double calcularEstrellaDeltaRB(List<Double> resistencias);
    
    double calcularEstrellaDeltaRC(List<Double> resistencias);
    
    double obtenerNumeradorEstrellaDelta(List<Double> resistencias);
    
    String formulaDeltaEstrella(List<Double> resistencias);
    String formulaEstrellaDelta(List<Double> resistencias);
    
}
