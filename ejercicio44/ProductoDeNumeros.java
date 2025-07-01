package ejercicio44;

import java.util.Scanner;

public class ProductoDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números naturales para calcular su producto");
        int n = scanner.nextInt();

        if (n > 0) {
            long producto = 1;
            int contador = 1;
            while (contador <= n) {
                producto = producto * contador;
                contador = contador + 1;
            }
            System.out.println("El producto de los " + n + " primeros números naturales es: "+producto);
        }else {
            System.out.println("Ingrese un número positivo o cero");
        }
    }
}

