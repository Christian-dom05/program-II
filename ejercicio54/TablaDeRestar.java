package ejercicio54;

import java.util.Scanner;

public class TablaDeRestar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 al 10");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabla de restar para el número " + numero + ":");
            int i = 1;
            while (i <= 10) {
                int resultado = numero - i;
                System.out.println(numero + " - " + i + " = " + resultado);
                i = i + 1;
            }
        } else {
            System.out.println("Número fuera del rango. Ingrese un número entre 1 y 10.");
        }
    }
}

