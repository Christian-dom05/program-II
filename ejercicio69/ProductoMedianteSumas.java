package ejercicio69;

import java.util.Scanner;

public class ProductoMedianteSumas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = scanner.nextInt();

        int producto = 0;
        int i = 1;

        boolean resultadoNegativo = false;
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            resultadoNegativo = true;
        }

        int absNum1 = num1;
        if (absNum1 < 0) {
            absNum1 = absNum1 * -1;
        }

        int absNum2 = num2;
        if (absNum2 < 0) {
            absNum2 = absNum2 * -1;
        }

        while (i <= absNum2) {
            producto = producto + absNum1;
            i = i + 1;
        }

        if (resultadoNegativo) {
            producto = producto * -1;
        }

        System.out.println("El producto de " + num1 + " y " + num2 + " (mediante sumas sucesivas) es: "+producto);
    }
}

