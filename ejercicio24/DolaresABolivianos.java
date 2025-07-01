package ejercicio24;

import java.util.Scanner;

public class DolaresABolivianos {
    public static void main(String[] args) {
        final double TIPO_CAMBIO = 15;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad en dólares");
        double dolares = scanner.nextDouble();

        double bolivianos = dolares * TIPO_CAMBIO;

        System.out.println("Resultado: "+dolares+"USD = "+bolivianos+"bs");
    }
}

