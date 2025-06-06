package models;

import ui.PedidoProductoComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyCafeteria implements Cafeteria{
    private String codigo, productName, codigoProducto;
    private double price;
    //private int quantity;
    private HashMap<String,ModeloProducto> productos;
    private HashMap<String, Integer> pedidos;
    private ModeloProducto modeloProducto;
    private int cantidadPedidoRealizado = 0;
    private int totalPedidoRealizado = 0;
    public MyCafeteria(){
        productos = new HashMap<>();
        pedidos = new HashMap<>();
    }
    @Override
    public void registrarProducto(String codigo, String productName, double price) {
        this.modeloProducto = new MyModeloProducto(codigo,productName,price);
        productos.put(codigo, modeloProducto);
        System.out.println(productos.get(codigo).getPrecio());

        //pedidos.put(codigo,0);
    }

    @Override
    public void iniciarPedido() {
        pedidos.clear();
    }

    @Override
    public void agregarProductoAlPedido(String codigoProducto, int quantity) {
        /*this.quantity = quantity;
        int cantidadActual = this.quantity;
        pedidos.put(codigoProducto, cantidadActual+quantity);*/

        int cantidadActual =  pedidos.getOrDefault(codigoProducto,0); //almacena nombres de pedidos
        //System.out.println("Agregando producto al pedido: " + codigoProducto + " con cantidad: " + quantity);

        pedidos.put(codigoProducto, quantity);
    }

    //Aqui está el error
    @Override
    public double getTotalPedidoActual() {
        double total = 0;
        //System.out.println("Entró al método getoTotalPedidoActual");
        //System.out.println("Cantidad de pedidos: "+pedidos.size());
        //System.out.println("Cantidad de productos existentes: "+productos.size());

        for(String codigo : pedidos.keySet()) {
            //System.out.println("Entró al ciclo for");
            ModeloProducto producto = productos.get(codigo);
            //System.out.println("Codigo de producto en el pedido: "+codigo);
            //System.out.println("Productos.get(codigo): "+productos.get("codigo"));
            if(producto != null){// No entra a la condicional
                //System.out.println("Entró a la condicional");
                int cantidad = pedidos.get(codigo);
                total += cantidad * producto.getPrecio();
            }
            if(producto==null){
                System.out.println("producto no encontrado para el código: "+codigo);
            }
        }
        return total;
    }

    @Override
    public List<ModeloProducto> getProductosDisponibles() {

        return new ArrayList<>(productos.values());
    }

    @Override
    public void finalizarPedido() {
        double total = getTotalPedidoActual();
        if(total>0){
            totalPedidoRealizado += total;
            cantidadPedidoRealizado++;
            pedidos.clear();
        }
    }

    @Override
    public double getMontoTotalPedidosRealizados() {
        return totalPedidoRealizado;
    }

    @Override
    public int getCantidadPedidosRealizados() {
        return cantidadPedidoRealizado;
    }
}
