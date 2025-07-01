package ejercicio6;

public class ValoresDeABC {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = a + 2 * b;
        c = c + b;
        b = c - a;
        a = b * c;
        System.out.println("Valor de a: "+a);
        System.out.println("Valor de b: "+b);
        System.out.println("Valor de c: "+c);
    }
}
