package ejercicio67;

public class NumerosPerfectosDelUnoAl250 {
    public static void main(String[] args) {
        System.out.println("Los números perfectos entre 1 y 250 son:");

        int numeroActual = 1;
        while (numeroActual <= 250) {
            int sumaDivisores = 0;
            int divisor = 1;
            while (divisor < numeroActual) {
                if (numeroActual % divisor == 0) {
                    sumaDivisores = sumaDivisores + divisor;
                }
                divisor = divisor + 1;
            }

            if (sumaDivisores == numeroActual && numeroActual != 0) {
                System.out.println(numeroActual);
            }
            numeroActual = numeroActual + 1;
        }
    }
}

