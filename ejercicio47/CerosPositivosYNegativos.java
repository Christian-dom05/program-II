package ejercicio47;

import java.util.Scanner;

public class CerosPositivosYNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        int i = 1;

        System.out.println("Ingrese 10 números");

        while (i <= 10) {
            System.out.println("Ingrese el número " + i + ":");
            double numero = scanner.nextDouble();

            if (numero > 0) {
                contadorPositivos = contadorPositivos + 1;
            } else if (numero < 0) {
                contadorNegativos = contadorNegativos + 1;
            } else {
                contadorCeros = contadorCeros + 1;
            }
            i = i + 1;
        }

        System.out.println("Cantidad de números positivos: "+contadorPositivos);
        System.out.println("Cantidad de números negativos: "+contadorNegativos);
        System.out.println("Cantidad de ceros: "+contadorCeros);
    }
}

