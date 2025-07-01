package ejercicio62;

import java.util.Scanner;

public class HallarValorMaximo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea introducir:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de números debe ser positiva");
        } else {
            System.out.println("Ingrese el número 1:");
            double maximo = scanner.nextDouble();

            int i = 2;
            while (i <= n) {
                System.out.println("Ingrese el número " + i + ":");
                double numeroActual = scanner.nextDouble();
                if (numeroActual > maximo) {
                    maximo = numeroActual;
                }
                i = i + 1;
            }

            System.out.println("El valor máximo de la serie de números es: "+maximo);
        }
    }
}

