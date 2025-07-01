package ejercicio41;

import java.util.Scanner;

public class NaturalesEnUnRangoDado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int inicio = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int fin = scanner.nextInt();

        if (inicio < fin) {
            System.out.println("Los números naturales desde " + inicio + " hasta " + fin + " son:");
            int numeroActual = inicio;
            while (numeroActual <= fin) {
                System.out.println(numeroActual);
                numeroActual = numeroActual + 1;
            }
        } else {
            System.out.println("Error: El primer número debe ser menor que el segundo");
        }
    }
}

