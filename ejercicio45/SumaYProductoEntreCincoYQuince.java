package ejercicio45;

public class SumaYProductoEntreCincoYQuince {
    public static void main(String[] args) {
        int suma = 0;
        int producto = 1;

        int numeroActual = 5;
        while (numeroActual <= 15) {
            suma = suma + numeroActual;
            producto = producto * numeroActual;
            numeroActual = numeroActual + 1;
        }

        System.out.println("La suma de los números entre 5 y 15 es: "+suma);
        System.out.println("El producto de los números entre 5 y 15 es: "+producto);
    }
}

