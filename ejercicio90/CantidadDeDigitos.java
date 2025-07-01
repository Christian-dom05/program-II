package ejercicio90;

import java.util.Scanner;

public class CantidadDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int numeroOriginal = scanner.nextInt();

        int numero = numeroOriginal;
        int contadorDigitos = 0;

        if (numero < 0) {
            numero = numero * -1;
        }

        if (numero == 0) {
            contadorDigitos = 1;
        } else {
            while (numero > 0) {
                numero = numero / 10;
                contadorDigitos = contadorDigitos + 1;
            }
        }

        System.out.println("El número " + numeroOriginal + " tiene la siguiente cantidad de dígitos: "+contadorDigitos);
    }
}

