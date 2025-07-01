package ejercicio22;

import java.util.Scanner;

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
        double x1,x2,y1,y2,d;
        x1 = 3;
        x2 = 5;
        y1 = 3;
        y2 = 7;

        d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        System.out.println(d);
    }
}
