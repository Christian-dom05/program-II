package ejercicio21;

import java.util.Scanner;

public class AreaDeTrianguloLongitudDeLados {
    public static void main(String[] args) {
        double a,b,c, p, A;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese longitud de lado 1");
        a = scanner.nextDouble();

        System.out.println("Ingrese longitud de lado 2");
        b = scanner.nextDouble();

        System.out.println("Ingrese longitud de lado 3");
        c = scanner.nextDouble();

        p = (1/2)*(a+b+c);
        A = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("El área del triángulo es: "+A);
    }
}
