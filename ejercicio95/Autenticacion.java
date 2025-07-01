package ejercicio95;

import java.util.Scanner;

public class Autenticacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String claveCorrecta = "programacion123";
        int intentosMaximos = 3;
        int intentosRealizados = 0;
        boolean accesoConcedido = false;

        System.out.println("Bienvenido a la zona virtual");

        while (intentosRealizados < intentosMaximos) {
            System.out.println("Intento " + (intentosRealizados + 1) + " de " + intentosMaximos);
            System.out.println("Ingrese su clave de acceso:");
            String claveIngresada = scanner.nextLine();

            if (claveIngresada.equals(claveCorrecta)) {
                System.out.println("¡Bienvenido! Acceso concedido a la zona virtual");
                accesoConcedido = true;
                break;
            } else {
                System.out.println("Clave incorrecta");
                intentosRealizados = intentosRealizados + 1;
            }
        }

        if (accesoConcedido == false) {
            System.out.println("Ha excedido el número de intentos. Su cuenta ha sido bloqueada");
        }
    }
}

