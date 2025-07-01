package ejercicio8;

public class SegundaExpresion {
    private double x;
    private double y;
    public SegundaExpresion(double x){
        this.x = x;

        this.y = ((x+y)/x) - ((3*x)/5);
    }
    public double resultado(){
        return y;
    }
}
