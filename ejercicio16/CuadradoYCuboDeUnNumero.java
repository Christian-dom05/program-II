package ejercicio16;

import java.util.Scanner;

public class CuadradoYCuboDeUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        try{
            System.out.println("Ingrese un número");
            numero = scanner.nextInt();
            int cuadrado = numero * numero;
            int cubo = numero*numero*numero;
            System.out.println(numero+"² -> "+cuadrado);
            System.out.println(numero+"³ -> "+cubo);
        }catch (NumberFormatException e){
            System.out.println("Caracter no válido");
        }
    }
}
