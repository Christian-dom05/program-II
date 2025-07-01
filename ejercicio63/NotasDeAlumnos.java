package ejercicio63;

import java.util.Scanner;

public class NotasDeAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de alumnos debe ser positiva");
        } else {
            int aprobados = 0;
            int reprobados = 0;
            double notaMaxima = -1;
            double notaMinima = 101;
            double sumaNotas = 0;
            int i = 1;

            while (i <= n) {
                System.out.println("Ingrese la nota del alumno " + i);
                double nota = scanner.nextDouble();

                if (nota < 0 || nota > 100) {
                    System.out.println("Nota inválida. Por favor, ingrese una nota entre 0 y 100.");
                    continue;  //sirve para saltar al siguiente ciclo del bucle
                }
                if (nota >= 51) {
                    aprobados = aprobados + 1;
                } else {
                    reprobados = reprobados + 1;
                }
                if (nota > notaMaxima) {
                    notaMaxima = nota;
                }
                if (nota < notaMinima) {
                    notaMinima = nota;
                }
                sumaNotas = sumaNotas + nota;
                i = i + 1;
            }

            double promedioGrupo = sumaNotas / n;

            System.out.println("Número de alumnos aprobados: "+aprobados);
            System.out.println("Número de alumnos reprobados: "+reprobados);
            System.out.println("Nota máxima del grupo: "+notaMaxima);
            System.out.println("Nota mínima del grupo: "+notaMinima);
            System.out.println("Promedio del grupo: "+promedioGrupo);
        }
    }
}

