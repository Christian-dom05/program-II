package ejercicio55;

import java.util.Scanner;

public class VerificarPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("El número " + numero + " no es primo.");
        } else {
            boolean esPrimo = true;
            int divisor = 2;
            while (divisor * divisor <= numero) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                    break;
                }
                divisor = divisor + 1;
            }

            if (esPrimo) {
                System.out.println("El número " + numero + " es primo");
            } else {
                System.out.println("El número " + numero + " no es primo");
            }
        }
    }
}

