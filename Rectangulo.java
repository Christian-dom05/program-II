import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Rectangulo {
    double base;
    double altura;
    double area;
    double perimetro;
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        area = base * altura;
        return area;
    }
    public double calcularPerimetro(){
        perimetro = base * base * altura * altura;
        return perimetro;
    }
    public void mostrarInfo(){
        System.out.println("---------------------");
        System.out.println("base: "+base);
        System.out.println("altura: "+altura);
        System.out.println("area: "+area);
        System.out.println("perimetro: "+perimetro);
        System.out.println("---------------------");
    }
}
