package ejercicio58;

import java.util.Scanner;

public class ParesYPromediosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea introducir");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de números debe ser positiva");
        } else {
            int contadorPares = 0;
            double sumaImpares = 0;
            int contadorImpares = 0;
            int i = 1;

            while (i <= n) {
                System.out.println("Ingrese el número " + i + ":");
                int numero = scanner.nextInt();

                if (numero % 2 == 0) {
                    contadorPares = contadorPares + 1;
                } else {
                    sumaImpares = sumaImpares + numero;
                    contadorImpares = contadorImpares + 1;
                }
                i = i + 1;
            }

            System.out.println("Cantidad de números pares: "+contadorPares);

            if (contadorImpares > 0) {
                double promedioImpares = sumaImpares / contadorImpares;
                System.out.println("Promedio de los números impares: "+promedioImpares);
            } else {
                System.out.println("No se ingresaron números impares para calcular el promedio.");
            }
        }
    }
}

