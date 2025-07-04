package controlador;

import modelo.Producto;

public interface IControladorCompra {
    void agregarPago(double monto);
    void agregarProducto(Producto p);
    void limpiar();
    void actualizarVista();
}
