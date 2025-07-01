package ejercicio46;

public class SumaParesEntreDiezYVeinte {
    public static void main(String[] args) {
        int sumaPares = 0;

        int numeroActual = 10;
        while (numeroActual <= 20) {
            if (numeroActual % 2 == 0) {
                sumaPares = sumaPares + numeroActual;
            }
            numeroActual = numeroActual + 1;
        }

        System.out.println("La suma de los números pares entre 10 y 20 es: "+sumaPares);
    }
}

