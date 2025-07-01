package ejercicio59;

import java.util.Scanner;

public class SumaPositivosYNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese números para sumarlos. Ingrese 0 para terminar");

        double sumaTotal = 0;
        double numero;

        do {
            System.out.println("Ingrese un número o 0 para finalizar:");
            numero = scanner.nextDouble();
            sumaTotal = sumaTotal + numero;
        } while (numero != 0);

        System.out.println("La suma total de los números ingresados es: "+sumaTotal);
    }
}

