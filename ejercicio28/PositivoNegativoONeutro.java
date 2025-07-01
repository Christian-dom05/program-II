package ejercicio28;

import java.util.Scanner;

public class PositivoNegativoONeutro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        double numero = scanner.nextDouble();

        if (numero == 0) {
            System.out.println("El número es neutro");
        } else if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
