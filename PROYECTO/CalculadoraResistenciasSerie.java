import java.util.Scanner;

public class CalculadoraResistenciasSerie {
    public static double calcularResistenciaEnSerie(double[] resistencias) {
        double resistenciaTotal = 0;
        for (double resistencia : resistencias) {
            resistenciaTotal += resistencia;
        }
        return resistenciaTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Resistencias en Serie");
        System.out.println("Ingresa los valores de las resistencias separados por espacios:");

        try {
            String entradaUsuario = scanner.nextLine();
            String[] valoresResistenciasStr = entradaUsuario.split(" ");
            double[] valoresResistencias = new double[valoresResistenciasStr.length];

            for (int i = 0; i < valoresResistenciasStr.length; i++) {
                valoresResistencias[i] = Double.parseDouble(valoresResistenciasStr[i]);
            }

            double resistenciaTotal = calcularResistenciaEnSerie(valoresResistencias);
            System.out.println("La resistencia total en serie es: " + resistenciaTotal + " ohmios.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Asegúrate de ingresar solo valores numéricos separados por espacios.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
