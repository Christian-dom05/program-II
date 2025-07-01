package ejercicio73;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos de la serie de Fibonacci que desea generar:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de elementos debe ser positiva");
        } else if (n == 1) {
            System.out.println("La serie de Fibonacci con 1 elemento es:");
            System.out.println(0);
        } else {
            System.out.println("La serie de Fibonacci con " + n + " elementos es:");
            long a = 0;
            long b = 1;
            int contador = 1;

            System.out.println(a);

            if (n > 1) {
                System.out.println(b);
                contador = 2;
                while (contador < n) {
                    long siguiente = a + b;
                    System.out.println(siguiente);
                    a = b;
                    b = siguiente;
                    contador = contador + 1;
                }
            }
        }
    }
}

