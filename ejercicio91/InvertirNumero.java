package ejercicio91;

import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int numeroOriginal = scanner.nextInt();

        int numero = numeroOriginal;
        int numeroInvertido = 0;
        boolean esNegativo = false;

        if (numero < 0) {
            esNegativo = true;
            numero = numero * -1;
        }

        if (numero == 0) {
            numeroInvertido = 0;
        } else {
            while (numero > 0) {
                int digito = numero % 10;
                numeroInvertido = numeroInvertido * 10 + digito;
                numero = numero / 10;
            }
        }

        if (esNegativo) {
            numeroInvertido = numeroInvertido * -1;
        }

        System.out.println("El número original es: "+numeroOriginal);
        System.out.println("El número invertido es: "+numeroInvertido);
    }
}

