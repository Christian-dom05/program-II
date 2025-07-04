package vista;
import controlador.ControladorCompra;
import modelo.Producto;

import java.util.List;

public interface IVistaCompra {
    void setControlador(ControladorCompra c);

    void setPagado(double monto);
    void setTotal(double monto);
    void setCambio(double monto);
    void setPedidos(List<Producto> productos);
}
