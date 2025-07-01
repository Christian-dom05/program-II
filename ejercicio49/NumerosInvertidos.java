package ejercicio49;

import java.util.Scanner;

public class NumerosInvertidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int numeroOriginal = scanner.nextInt();

        String numeroComoString = String.valueOf(numeroOriginal);
        int longitud = numeroComoString.length();

        if (longitud < 2) {
            System.out.println("El número debe tener al menos dos dígitos");
        } else {
            char primerDigito = numeroComoString.charAt(0);
            char ultimoDigito = numeroComoString.charAt(longitud - 1);

            String numeroInvertidoString = "";
            numeroInvertidoString = numeroInvertidoString + ultimoDigito;

            int i = 1;
            while (i < longitud - 1) {
                numeroInvertidoString = numeroInvertidoString + numeroComoString.charAt(i);
                i = i + 1;
            }

            numeroInvertidoString = numeroInvertidoString + primerDigito;

            System.out.println("El número original es: "+numeroOriginal);
            System.out.println("El número con el primer y último dígito invertidos es: "+numeroInvertidoString);
        }
    }
}

