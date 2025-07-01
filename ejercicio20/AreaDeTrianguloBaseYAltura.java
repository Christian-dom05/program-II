package ejercicio20;

import java.util.Scanner;

public class AreaDeTrianguloBaseYAltura {
    public static void main(String[] args) {
        double A,h,b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese base");
        b = scanner.nextDouble();

        System.out.println("Ingrese altura");
        h = scanner.nextDouble();

        A = b*h;

        System.out.println("Área del triángulo: "+A);
    }
}
