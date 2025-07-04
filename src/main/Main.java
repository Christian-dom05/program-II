package main;

import controlador.ControladorCompra;
import modelo.Producto;
import vista.VistaCompra;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        ControladorCompra controladorCompra = new ControladorCompra();
        Producto producto1 = new Producto("Mantequilla", 30);
        Producto producto2 = new Producto("Queso",10);
        Producto producto3 = new Producto("Lechuga",20);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);


        VistaCompra vistaCompra = new VistaCompra(productos);
        vistaCompra.setControlador(controladorCompra);
    }
}
