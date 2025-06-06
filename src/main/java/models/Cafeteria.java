package models;

import java.util.List;

public interface Cafeteria {

    void registrarProducto(String codigo, String productName, double price);

    void iniciarPedido();

    void agregarProductoAlPedido(String codigoProducto, int quantity);

    double getTotalPedidoActual();

    List<ModeloProducto> getProductosDisponibles();

    void finalizarPedido();

    double getMontoTotalPedidosRealizados();

    int getCantidadPedidosRealizados();

}
