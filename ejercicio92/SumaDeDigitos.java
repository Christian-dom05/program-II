package ejercicio92;

import java.util.Scanner;

public class SumaDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int numeroOriginal = scanner.nextInt();

        int numero = numeroOriginal;
        int sumaDigitos = 0;

        if (numero < 0) {
            numero = numero * -1;
        }

        if (numero == 0) {
            sumaDigitos = 0;
        } else {
            while (numero > 0) {
                int digito = numero % 10;
                sumaDigitos = sumaDigitos + digito;
                numero = numero / 10;
            }
        }

        System.out.println("El número original es: "+numeroOriginal);
        System.out.println("La suma de sus dígitos es: "+sumaDigitos);
    }
}

