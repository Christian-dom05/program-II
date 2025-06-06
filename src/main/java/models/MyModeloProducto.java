package models;

public class MyModeloProducto implements ModeloProducto{
    String codigo, nombre;
    double precio;
    public MyModeloProducto(String codigo, String nombre, double precio){
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }
    public MyModeloProducto(){

    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }
}
