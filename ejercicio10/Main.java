package ejercicio10;

public class Main {
    public static void main(String[] args) {
        int A = 4;
        int B = 5;
        int C = 1;

        int resultado = B*A-(B*B)/4*C;
        System.out.println("Resultado 1: "+resultado);

        resultado = (((B+C)/2*A+10)*3*B)-6;
        System.out.println("Resultado 2: "+resultado);
    }
}
