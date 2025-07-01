package ejercicio29;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorAbsoluto;

        System.out.println("Ingrese un número");
        double numero = scanner.nextDouble();

        if (numero < 0) {
            valorAbsoluto = numero * -1;
        } else {
            valorAbsoluto = numero;
        }

        System.out.println("El número ingresado es:");
        System.out.println(numero);
        System.out.println("Su valor absoluto es:");
        System.out.println(valorAbsoluto);
    }
}

