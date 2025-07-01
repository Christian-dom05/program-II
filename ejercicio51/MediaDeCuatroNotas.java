package ejercicio51;

import java.util.Scanner;

public class MediaDeCuatroNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota 1");
        double nota1 = scanner.nextDouble();

        System.out.println("Ingrese la nota 2");
        double nota2 = scanner.nextDouble();

        System.out.println("Ingrese la nota 3");
        double nota3 = scanner.nextDouble();

        System.out.println("Ingrese la nota 4");
        double nota4 = scanner.nextDouble();

        double sumaNotas = nota1 + nota2 + nota3 + nota4;
        double media = sumaNotas / 4;

        System.out.println("La media de las cuatro notas es: "+media);
    }
}

