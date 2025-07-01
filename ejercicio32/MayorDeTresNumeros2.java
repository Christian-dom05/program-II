package ejercicio32;

import java.util.Scanner;

public class MayorDeTresNumeros2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número");
        double num3 = scanner.nextDouble();

        double mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El mayor de los tres números es");
        System.out.println(mayor);
    }
}

