package ejercicio60;

import java.util.Scanner;

public class OperarConDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1 = Sumar");
        System.out.println("2 = Restar");
        System.out.println("3 = Multiplicar");
        System.out.println("4 = Dividir");
        int opcion = scanner.nextInt();

        double resultado;

        if (opcion == 1) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es:");
            System.out.println(resultado);
        } else if (opcion == 2) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es:");
            System.out.println(resultado);
        } else if (opcion == 3) {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es:");
            System.out.println(resultado);
        } else if (opcion == 4) {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("El resultado de la división es:");
                System.out.println(resultado);
            } else {
                System.out.println("Error: No se puede dividir por cero.");
            }
        } else {
            System.out.println("Opción no válida. Seleccione un número entre 1 y 4.");
        }
    }
}

