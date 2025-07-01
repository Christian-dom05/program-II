package ejercicio26;

import java.util.Scanner;

public class EdadDePersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }
    }
}
