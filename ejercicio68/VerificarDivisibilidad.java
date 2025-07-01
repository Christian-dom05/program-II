package ejercicio68;

import java.util.Scanner;

public class VerificarDivisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = scanner.nextInt();

        if (num2 == 0) {
            System.out.println("Error: El segundo número no puede ser cero");
        } else {
            if (num1 % num2 == 0) {
                System.out.println("El número " + num1 + " es divisible entre " + num2);
            } else {
                System.out.println("El número " + num1 + " NO es divisible entre " + num2);
            }
        }
    }
}

