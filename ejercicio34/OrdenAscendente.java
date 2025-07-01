package ejercicio34;

import java.util.Scanner;

public class OrdenAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número");
        double num3 = scanner.nextDouble();

        System.out.println("Números ordenados ascendentemente");

        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1);
            if (num2 <= num3) {
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2);
            if (num1 <= num3) {
                System.out.println(num1);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num1);
            }
        } else {
            System.out.println(num3);
            if (num1 <= num2) {
                System.out.println(num1);
                System.out.println(num2);
            } else {
                System.out.println(num2);
                System.out.println(num1);
            }
        }
    }
}
