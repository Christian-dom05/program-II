package modelo;
import java.util.List;

public interface IDatosCompra {
    void agregarProducto(Producto p);
    void limpiar();
    double getTotal();
    double getPagado();
    void agregarPago(double monto);
    double getCambio();
    List<Producto> getProductos();
}

