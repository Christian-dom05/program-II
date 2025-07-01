package ejercicio71;

import java.util.Scanner;

public class ElevarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base");
        int m = scanner.nextInt();

        System.out.println("Ingrese el exponente");
        int n = scanner.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Error: M y N deben ser números positivos");
        } else {
            long resultado = 1;
            int contador = 0;

            if (n == 0) {
                resultado = 1;
            } else {
                while (contador < n) {
                    resultado = resultado * m;
                    contador = contador + 1;
                }
            }

            System.out.println("El resultado de " + m + " elevado a la " + n + " es: "+resultado);
        }
    }
}

