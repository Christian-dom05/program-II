package ejercicio88;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de x");
        double x = scanner.nextDouble();

        System.out.println("Ingrese el valor de n (exponente máximo y divisor, debe ser positivo)");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("n debe ser un número positivo");
        } else {
            double suma = 0.0;
            int i = 1;

            while (i <= n) {
                double potenciaX = 1.0;
                int k = 0;
                while (k < i) {
                    potenciaX = potenciaX * x;
                    k = k + 1;
                }

                suma = suma + (potenciaX / i);
                i = i + 1;
            }
            System.out.println("La suma S = x + x^2/2 + ... + x^" + n + "/" + n + " es: "+suma);
        }
    }
}

