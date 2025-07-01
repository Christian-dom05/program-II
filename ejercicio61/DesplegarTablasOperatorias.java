package ejercicio61;

import java.util.Scanner;

public class DesplegarTablasOperatorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número base entre 1 y 10 para la tabla");
        int numeroBase = scanner.nextInt();

        if (numeroBase < 1 || numeroBase > 10) {
            System.out.println("Número base fuera del rango. Ingrese un número entre 1 y 10.");
        } else {
            System.out.println("Seleccione el tipo de tabla");
            System.out.println("1 = Sumar");
            System.out.println("2 = Restar");
            System.out.println("3 = Multiplicar");
            System.out.println("4 = Dividir");
            int tipoTabla = scanner.nextInt();

            System.out.println("-------------------------------------------");

            if (tipoTabla == 1) {
                System.out.println("Tabla de Sumar para el " + numeroBase + ":");
                int i = 1;
                while (i <= 10) {
                    System.out.println(numeroBase + " + " + i + " = " + (numeroBase + i));
                    i = i + 1;
                }
            } else if (tipoTabla == 2) {
                System.out.println("Tabla de Restar para el " + numeroBase + ":");
                int i = 1;
                while (i <= 10) {
                    System.out.println(numeroBase + " - " + i + " = " + (numeroBase - i));
                    i = i + 1;
                }
            } else if (tipoTabla == 3) {
                System.out.println("Tabla de Multiplicar para el " + numeroBase + ":");
                int i = 1;
                while (i <= 10) {
                    System.out.println(numeroBase + " * " + i + " = " + (numeroBase * i));
                    i = i + 1;
                }
            } else if (tipoTabla == 4) {
                System.out.println("Tabla de Dividir para el " + numeroBase + ":");
                int i = 1;
                while (i <= 10) {
                    if (i != 0) {
                        System.out.println(numeroBase + " / " + i + " = " + ((double) numeroBase / i));
                    } else {
                        System.out.println(numeroBase + " / " + i + " = Indefinido");
                    }
                    i = i + 1;
                }
            } else {
                System.out.println("Opción no válida, debe elegir del 1 al 4");
            }
        }
    }
}

