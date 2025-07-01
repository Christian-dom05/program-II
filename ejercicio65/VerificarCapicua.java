package ejercicio65;

import java.util.Scanner;

public class VerificarCapicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int numeroOriginal = scanner.nextInt();

        int numero = numeroOriginal;
        int numeroInvertido = 0;
        int digito;

        while (numero != 0) {
            digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero = numero / 10;
        }

        System.out.println("El número original es: "+numeroOriginal);
        System.out.println("El número invertido es: "+numeroInvertido);

        if (numeroOriginal == numeroInvertido) {
            System.out.println("El número " + numeroOriginal + " es capicúa");
        } else {
            System.out.println("El número " + numeroOriginal + " NO es capicúa");
        }
    }
}

