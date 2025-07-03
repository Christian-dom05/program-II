import java.util.Scanner;

public class App {

    final static Scanner scanner = new Scanner(System.in);
    static Cine cine;

    private static void comprarBoleto() {
        boolean flag;
        int comprarFila;
        int comprarColumna;
        do {
            //hacer un try-catch NumberFormatException aquí
            System.out.println("\nIngresa un número de fila");
            comprarFila = scanner.nextInt();
            System.out.println("\nIngresa un número de columna");
            comprarColumna = scanner.nextInt();
            flag = cine.verificarAsiento(comprarFila, comprarColumna);
            // catch agarrar el NumberFormatException aquí 
        } while (!flag);

        cine.comprarBoleto(comprarFila, comprarColumna);
    }

    public static void main(String[] args) {

        String menu = "\n1. Ver asientos\n" + "2. Comprar boletos\n" + "3. Estadísticas\n" + "4. Salir";

        // hacer otro try catch que agarre NumberFormatException
        System.out.println("\nSe creará una sala de cine, por favor ingresar : \n");
        System.out.println("Ingresar filas");
        int filas = scanner.nextInt();
        System.out.println("Ingresar columnas");
        int columnas = scanner.nextInt();
        // mostrar el NumberFormatException

        cine = new Cine(filas, columnas);
        cine.llenarSalaPorDefecto();
        cine.imprimirSala();
        int opcion;
        do {
            System.out.println(menu);
            // hacer otro try catch que agarre NumberFormatException
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    cine.imprimirSala();
                    break;
                case 2:
                    comprarBoleto();
                    break;
                case 3:
                    cine.estadisticas();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            // lanzar excepciones 
        } while (opcion != 4);
    }

}
