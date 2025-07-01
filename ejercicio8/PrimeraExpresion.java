package ejercicio8;

public class PrimeraExpresion {
    private double a;
    private double m;
    private double n;
    private double p;
    private double q;
    public PrimeraExpresion( double n, double m, double p, double q){
        this.n = n;
        this.m = m;
        this.p = p;
        this.q = q;
        this.a = m + (n/(p-q));
     }
     public double resultado(){
        return a;
     }
}
