public class Vehiculo {
    static int id = 0;
    int codigo;
    int precio;
    String marca = "Sin datos";
    String modelo = "Sin datos";
    String color = "Sin datos";
    int codigoMotor = 0;
    int codigoChasis = 0;
    public Vehiculo(String modelo, int precio){
        this.modelo = modelo;
        this.precio = precio;
        id++;
        this.codigo = id;
    }
    public Vehiculo(String modelo, String marca, String color, int precio){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        id++;
        this.codigo = id;
    }
    public Vehiculo(int idM, int idC, int precio){
        this.codigoMotor = idM;
        this.codigoChasis = idC;
        this.precio = precio;
        id++;
        this.codigo = id;
    }
    public void detalles()
    {
        System.out.println("Auto id: " + id);
        System.out.println("Auto: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Código de motor: " + codigoMotor);
        System.out.println("Código de chasis: " + codigoChasis);
        System.out.println("Precio: " + precio);
        System.out.println("------------------------------------");
    }
    public void descuento(int descuento)
    {
        if(descuento > 90){
            System.out.println("Mucho");
        }
        else {
            precio = precio - (precio * descuento / 100);
        }
    }
}
