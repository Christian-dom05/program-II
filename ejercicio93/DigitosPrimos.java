package ejercicio93;

import java.util.Scanner;

public class DigitosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int numeroOriginal = scanner.nextInt();

        int numero = numeroOriginal;
        int contadorDigitosPrimos = 0;

        if (numero < 0) {
            numero = numero * -1;
        }

        if (numero == 0) {
            System.out.println("El número " + numeroOriginal + " no contiene dígitos primos");
        } else {
            while (numero > 0) {
                int digito = numero % 10;

                if (digito == 2 || digito == 3 || digito == 5 || digito == 7) {
                    contadorDigitosPrimos = contadorDigitosPrimos + 1;
                }
                numero = numero / 10;
            }

            System.out.println("El número " + numeroOriginal + " tiene la siguiente cantidad de dígitos primos: "+contadorDigitosPrimos);
        }
    }
}

