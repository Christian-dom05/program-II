package ejercicio17;

import java.util.Scanner;

public class AreaCuadrado {
    private double a,l;
    public void ingresarLado(double lado){
        this.l = lado;
    }
    public double calcularArea(){
        return l*l;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCuadrado areaCuadrado = new AreaCuadrado();
        System.out.println("Ingrese el lado del cuadrado");
        areaCuadrado.ingresarLado(scanner.nextDouble());
        System.out.println("El área es: "+areaCuadrado.calcularArea());
    }
}
