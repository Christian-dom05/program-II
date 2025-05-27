public class Auto {
    String modelo;
    String color;
    static int autoVendido = 0;
    String marca;
    Auto(String marca, String modelo, String color)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.autoVendido++;
    }
    public void detalles()
    {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Número de auto: " + autoVendido);
    }
}
