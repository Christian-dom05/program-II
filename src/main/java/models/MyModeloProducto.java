package models;

public class MyModeloProducto implements ModeloProducto{
    String codigo, nombre;
    double precio;
    public MyModeloProducto(String nombre, String codigo, double precio){
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
