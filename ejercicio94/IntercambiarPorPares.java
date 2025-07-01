package ejercicio94;

import java.util.Scanner;

public class IntercambiarPorPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero con una cantidad PAR de dígitos");
        int numeroOriginal = scanner.nextInt();

        String numeroComoString = String.valueOf(numeroOriginal);
        int longitud = numeroComoString.length();

        if (longitud % 2 != 0) {
            System.out.println("Error: El número debe tener una cantidad par de dígitos");
        } else {
            String numeroIntercambiado = "";
            int i = 0;
            while (i < longitud) {
                char digito2 = numeroComoString.charAt(i + 1);
                char digito1 = numeroComoString.charAt(i);

                numeroIntercambiado = numeroIntercambiado + digito2;
                numeroIntercambiado = numeroIntercambiado + digito1;

                i = i + 2;
            }

            System.out.println("El número original es: "+numeroOriginal);
            System.out.println("El número con los dígitos intercambiados de par en par es: "+numeroIntercambiado);
        }
    }
}

