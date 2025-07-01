package ejercicio25;

import java.util.Scanner;

public class DeGigaABytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la capacidad del disco duro en Gigabytes");
        double gigabytes = scanner.nextDouble();

        double bytes = gigabytes * 1024 * 1024 * 1024;

        System.out.println("La capacidad en Bytes es: "+bytes);
    }
}

