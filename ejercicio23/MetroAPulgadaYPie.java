package ejercicio23;

public class MetroAPulgadaYPie {
    public static void main(String[] args) {
        double metro,pulgada,pie;
        final double metroAPulgada = 0.0254;
        final double metroAPie = 0.3048;
        metro = 4;

        pulgada = metro/metroAPulgada;
        pie = metro/metroAPie;

        System.out.printf(metro+"mts = "+pulgada+"in");
        System.out.printf(metro+"mts = "+pie+"ft");
    }
}
