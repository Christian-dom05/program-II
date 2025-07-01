package ejercicio66;

public class PrimosDelUnoAlCinco {
    public static void main(String[] args) {
        System.out.println("Los números primos entre 1 y 50 son");

        int numeroActual = 2;
        while (numeroActual <= 50) {
            boolean esPrimo = true;
            int divisor = 2;
            while (divisor * divisor <= numeroActual) {
                if (numeroActual % divisor == 0) {
                    esPrimo = false;
                    break;
                }
                divisor = divisor + 1;
            }

            if (esPrimo) {
                System.out.println(numeroActual);
            }
            numeroActual = numeroActual + 1;
        }
    }
}

