package ejercicio8;

public class CuartaExpresion {
    private double a,b,c,x,z;
    public CuartaExpresion(double a,double b,double c,double z){
        this.a =a;
        this.b = b;
        this.c = c;
        this.z = z;

        this.x= (-b+Math.sqrt((b*b)-4*a*c)) / 2*a;
    }
    public double resultado(){
        return x;
    }
}
