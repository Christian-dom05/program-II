package ejercicio52;

import java.util.Scanner;

public class PrimerosNMultiplosDeSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de múltiplos de 7");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Los " + n + " primeros múltiplos de 7 son:");
            int contador = 1;
            int multiplo = 7;
            while (contador <= n) {
                System.out.println(multiplo);
                multiplo = multiplo + 7;
                contador = contador + 1;
            }
        } else {
            System.out.println("Ingrese un número positivo");
        }
    }
}

