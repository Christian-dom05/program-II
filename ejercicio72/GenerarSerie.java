package ejercicio72;

import java.util.Scanner;

public class GenerarSerie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos de la serie que desea generar");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad de elementos debe ser positiva");
        } else {
            System.out.println("La serie generada es");
            int valorActual = -2;
            int contador = 1;
            while (contador <= cantidad) {
                System.out.println(valorActual);
                valorActual = valorActual - 2;
                contador = contador + 1;
            }
        }
    }
}

