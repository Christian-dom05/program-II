package models;

import ui.PedidoProductoComponent;

import java.util.HashMap;
import java.util.List;

public class MyCafeteria implements Cafeteria{
    private String codigo, productName, codigoProducto;
    private double price;
    private int quantity;
    private HashMap<String,Double> producto;
    private HashMap<String, Integer> pedido;
    private static  int cantidadPedido;
    public MyCafeteria(){
        producto = new HashMap<>();
        pedido = new HashMap<>();
    }
    @Override
    public void registrarProducto(String codigo, String productName, double price) {
        this.productName = productName;
        producto.put(codigo,price);
    }

    @Override
    public void iniciarPedido() {

    }

    @Override
    public void agregarProductoAlPedido(String codigoProducto, int quantity) {
        pedido.put(codigoProducto,quantity);
    }

    @Override
    public double getTotalPedidoActual() {
        return 0;
    }

    @Override
    public List<ModeloProducto> getProductosDisponibles() {
        return null;
    }

    @Override
    public void finalizarPedido() {

    }

    @Override
    public double getMontoTotalPedidosRealizados() {
        return 0;
    }

    @Override
    public int getCantidadPedidosRealizados() {
        return 0;
    }
}
