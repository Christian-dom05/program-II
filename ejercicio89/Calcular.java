package ejercicio89;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de x");
        double x = scanner.nextDouble();

        System.out.println("Ingrese el valor de n (número de términos, debe ser no negativo)");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("n debe ser un número no negativo");
        } else {
            double suma = 0.0;
            int i = 0;

            while (i <= n) {
                double potenciaX = 1.0;
                int k = 0;
                while (k < i) {
                    potenciaX = potenciaX * x;
                    k = k + 1;
                }

                long factorialI = 1;
                int j = 1;
                while (j <= i) {
                    factorialI = factorialI * j;
                    j = j + 1;
                }

                if (factorialI != 0) {
                    suma = suma + (potenciaX / factorialI);
                } else {
                    System.out.println("Error: Factorial de cero inesperado en el denominador.");
                }

                i = i + 1;
            }
            System.out.println("La suma S = 1 + x/1! + x^2/2! + ... + x^" + n + "/" + n + "! es: "+suma);
        }
    }
}

