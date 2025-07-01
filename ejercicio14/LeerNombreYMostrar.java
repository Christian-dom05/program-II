package ejercicio14;

import java.util.Scanner;

public class LeerNombreYMostrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String nombre = scanner.nextLine();

        System.out.println("Bienvenido "+nombre);
    }
}
