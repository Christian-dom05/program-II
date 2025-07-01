package ejercicio30;

import java.util.Scanner;

public class OrdenAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número");
        double num2 = scanner.nextDouble();

        System.out.println("Los números ordenados ascendentemente son");
        if (num1 < num2) {
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}

