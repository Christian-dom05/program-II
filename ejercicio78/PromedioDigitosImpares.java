package ejercicio78;

import java.util.Scanner;

public class PromedioDigitosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numeroOriginal = scanner.nextInt();

        int numero = numeroOriginal;
        int sumaDigitosImpares = 0;
        int contadorDigitosImpares = 0;

        if (numero < 0) {
            numero = numero * -1;
        }

        if (numero == 0) {
            System.out.println("El número 0 no tiene dígitos impares para promediar");
        } else {
            while (numero > 0) {
                int digito = numero % 10;
                if (digito % 2 != 0) {
                    sumaDigitosImpares = sumaDigitosImpares + digito;
                    contadorDigitosImpares = contadorDigitosImpares + 1;
                }
                numero = numero / 10;
            }

            if (contadorDigitosImpares > 0) {
                double promedio = (double) sumaDigitosImpares / contadorDigitosImpares;
                System.out.println("El promedio de los dígitos impares del número " + numeroOriginal + " es: "+promedio);
            } else {
                System.out.println("El número " + numeroOriginal + " no contiene dígitos impares");
            }
        }
    }
}

