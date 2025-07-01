package ejercicio64;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero mayor a cero para calcular su factorial");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("El número debe ser mayor a cero");
        } else {
            int factorial = 1;
            int i = 1;
            while (i <= numero) {
                factorial = factorial * i;
                i = i + 1;
            }
            System.out.println("El factorial de " + numero + " es: "+factorial);
        }
    }
}

