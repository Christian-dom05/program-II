package ejercicio37;

import java.util.Scanner;

public class DiasDeLaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 y 7 para el día de la semana:");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Lunes");
        } else if (opcion == 2) {
            System.out.println("Martes");
        } else if (opcion == 3) {
            System.out.println("Miércoles");
        } else if (opcion == 4) {
            System.out.println("Jueves");
        } else if (opcion == 5) {
            System.out.println("Viernes");
        } else if (opcion == 6) {
            System.out.println("Sábado");
        } else if (opcion == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Fuera del rango. ingrese un número entre 1-7");
        }
    }
}
