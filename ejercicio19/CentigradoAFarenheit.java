package ejercicio19;

import java.util.Scanner;

public class CentigradoAFarenheit {
    public static void main(String[] args) {
        double centigrados, farenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura dada en grados centígrados");
        centigrados = scanner.nextDouble();
        farenheit = ((9/5)*centigrados)+32;
        System.out.println("Conversión a grado Farenheit: "+farenheit);
    }
}
