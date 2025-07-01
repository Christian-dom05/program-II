package ejercicio40;

import java.util.Scanner;

public class PrimerosNNumerosNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números naturales que desea mostrar");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Los " + n + " primeros números naturales son:");
            int contador = 1;
            while (contador <= n) {
                System.out.println(contador);
                contador = contador + 1;
            }
        } else {
            System.out.println("Ingrese un número positivo");
        }
    }
}
