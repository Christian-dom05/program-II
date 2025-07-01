package ejercicio7;

public class ValorDEX {
    public static void main(String[] args) {
        int x = 2;
        x = (x + x)*(x + x);
        x = (x + (x*x) + 5)*(x + (x*x) + 5);
        System.out.println("Valor de x: "+x);
    }
}
