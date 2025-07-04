package modelo;

import java.util.ArrayList;
import java.util.List;

public class Producto{
    private ArrayList<Producto> p;
    private String nombre;
    private double precio;
    public Producto(String nombre, double precio){
        p = new ArrayList<>();
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre +" "+precio;
    }
}

