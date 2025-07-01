package ejercicio42;

import java.util.Scanner;

public class RangoDadoDesconocido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int numA = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int numB = scanner.nextInt();

        int inicio;
        int fin;

        if (numA < numB) {
            inicio = numA;
            fin = numB;
        } else {
            inicio = numB;
            fin = numA;
        }

        System.out.println("Los números naturales desde " + inicio + " hasta " + fin + " son:");
        int numeroActual = inicio;
        while (numeroActual <= fin) {
            System.out.println(numeroActual);
            numeroActual = numeroActual + 1;
        }
    }
}

