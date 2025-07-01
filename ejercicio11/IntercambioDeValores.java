package ejercicio11;

public class IntercambioDeValores {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int c = a;
        a = b;
        b = c;
        System.out.println("valor de a: "+a);
        System.out.println("Valor de b: "+b);
    }
}
