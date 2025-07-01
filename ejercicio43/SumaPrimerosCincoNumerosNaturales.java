package ejercicio43;

public class SumaPrimerosCincoNumerosNaturales {
    public static void main(String[] args) {
        int suma = 0;
        int contador = 1;
        while (contador <= 5) {
            suma = suma + contador;
            contador = contador + 1;
        }
        System.out.println("La suma de los 5 primeros números naturales es: "+suma);
    }
}
