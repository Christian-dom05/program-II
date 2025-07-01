package ejercicio36;

import java.util.Scanner;

public class EstacionesDelAño {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Primavera");
        } else if (opcion == 2) {
            System.out.println("Verano");
        } else if (opcion == 3) {
            System.out.println("Otoño");
        } else if (opcion == 4) {
            System.out.println("Invierno");
        } else {
            System.out.println("Fuera del rango. Ingrese número entre 1-4");
        }
    }
}

