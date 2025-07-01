package ejercicio50;

import java.util.Scanner;

public class SumarCincoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int i = 1;

        System.out.println("Ingrese 5 números para sumarlos");

        while (i <= 5) {
            System.out.println("Ingrese el número " + i + ":");
            double numero = scanner.nextDouble();
            suma = suma + numero;
            i = i + 1;
        }

        System.out.println("La suma total de los 5 números es: "+suma);
    }
}

