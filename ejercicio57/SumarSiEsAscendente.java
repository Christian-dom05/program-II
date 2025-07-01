package ejercicio57;

import java.util.Scanner;

public class SumarSiEsAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea sumar");
        int cantidadNumeros = scanner.nextInt();

        if (cantidadNumeros <= 0) {
            System.out.println("La cantidad de números debe ser positiva");
        } else {
            double sumaTotal = 0;
            double numeroAnterior = 0;
            boolean estanOrdenados = true;
            int i = 1;

            while (i <= cantidadNumeros) {
                System.out.println("Ingrese el número " + i + ":");
                double numeroActual = scanner.nextDouble();

                if (i == 1) {
                    numeroAnterior = numeroActual;
                } else {
                    if (numeroActual < numeroAnterior) {
                        estanOrdenados = false;
                    }
                    numeroAnterior = numeroActual;
                }
                sumaTotal = sumaTotal + numeroActual;
                i = i + 1;
            }

            System.out.println("La suma total de los números es: "+sumaTotal);

            if (estanOrdenados) {
                System.out.println("Los números fueron ingresados en orden ascendente.");
            } else {
                System.out.println("Los números noo fueron ingresados en orden ascendente.");
            }
        }
    }
}

