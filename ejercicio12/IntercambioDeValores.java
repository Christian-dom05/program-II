package ejercicio12;

public class IntercambioDeValores {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        int c = 6;
        System.out.println("Valor de b: "+b);
        System.out.println("Valor de c: "+c);
        System.out.println("Valor de a: "+a);


        int auxiliar = a;
        a = c;
        c = b;
        b = auxiliar;
        System.out.println("------------------------");

        System.out.println("Valor de b: "+b);
        System.out.println("Valor de c: "+c);
        System.out.println("Valor de a: "+a);
    }
}
