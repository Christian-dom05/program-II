package ejercicio8;

public class TerceraExpresion {
    private double z,m,n,p,q,r,s;
    public TerceraExpresion(double m,double n,double p,double q,double r,double s){
        this.m = m;
        this.n = n;
        this.p = p;
        this.q = q;
        this.r = r;
        this.s = s;

        this.z = (m+(n/p)) / (q-(r/s));
    }
    public double resultado(){
        return z;
    }
}
