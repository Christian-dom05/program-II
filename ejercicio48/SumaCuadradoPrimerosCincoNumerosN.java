package ejercicio48;

public class SumaCuadradoPrimerosCincoNumerosN {
    public static void main(String[] args) {
        int sumaCuadrados = 0;
        int numeroActual = 1;

        while (numeroActual <= 5) {
            int cuadrado = numeroActual * numeroActual;
            sumaCuadrados = sumaCuadrados + cuadrado;
            numeroActual = numeroActual + 1;
        }

        System.out.println("La suma de los cuadrados de los primeros 5 números naturales es: "+sumaCuadrados);
    }
}

