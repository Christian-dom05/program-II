package ejercicio70;

import java.util.Scanner;

public class DivisionesMedianteRestas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dividendo");
        int dividendo = scanner.nextInt();

        System.out.println("Ingrese el divisor");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero");
        } else {
            int cociente = 0;
            int resto = dividendo;

            boolean resultadoNegativo = false;
            if ((dividendo < 0 && divisor > 0) || (dividendo > 0 && divisor < 0)) {
                resultadoNegativo = true;
            }

            int absDividendo = dividendo;
            if (absDividendo < 0) {
                absDividendo = absDividendo * -1;
            }

            int absDivisor = divisor;
            if (absDivisor < 0) {
                absDivisor = absDivisor * -1;
            }

            while (absDividendo >= absDivisor) {
                absDividendo = absDividendo - absDivisor;
                cociente = cociente + 1;
            }
            resto = absDividendo;

            if (resultadoNegativo) {
                cociente = cociente * -1;
            }
            if (dividendo < 0 && resto != 0) {
                resto = resto * -1;
            }


            System.out.println("El cociente de la división (por restas sucesivas) es: "+cociente);
            System.out.println("El resto es: "+resto);
        }
    }
}

