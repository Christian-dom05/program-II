package ejercicio8;

public class QuintaExpresion {
    private double d,x1, x2,y1,y2;
    public QuintaExpresion(double x1,double x2,double y1,double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        this.d = Math.sqrt(Math.pow ((x2-x1),2) + Math.pow((y2-y1),2));
    }
    public double resultado(){
        return d;
    }
}
