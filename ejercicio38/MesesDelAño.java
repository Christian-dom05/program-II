package ejercicio38;

import java.util.Scanner;

public class MesesDelAño {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1-12 para el mes");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Enero");
        } else if (opcion == 2) {
            System.out.println("Febrero");
        } else if (opcion == 3) {
            System.out.println("Marzo");
        } else if (opcion == 4) {
            System.out.println("Abril");
        } else if (opcion == 5) {
            System.out.println("Mayo");
        } else if (opcion == 6) {
            System.out.println("Junio");
        } else if (opcion == 7) {
            System.out.println("Julio");
        } else if (opcion == 8) {
            System.out.println("Agosto");
        } else if (opcion == 9) {
            System.out.println("Septiembre");
        } else if (opcion == 10) {
            System.out.println("Octubre");
        } else if (opcion == 11) {
            System.out.println("Noviembre");
        } else if (opcion == 12) {
            System.out.println("Diciembre");
        } else {
            System.out.println("ERROR: Número fuera del rango. Ingrese un número entre 1-12.");
        }
    }
}

