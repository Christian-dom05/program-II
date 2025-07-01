package ejercicio18;

import java.util.Scanner;

public class PerimetroYAreaDeRectangulo {
    public static void main(String[] args) {
        double a,b,h,p;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese base");
        b = scanner.nextDouble();

        System.out.println("Ingerse altura");
        h = scanner.nextDouble();

        a = b*h;
        p = b*h*b*h;

        System.out.println("Área: "+a);
        System.out.println("Perímetro: "+p);
    }
}
