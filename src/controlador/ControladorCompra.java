package controlador;

import modelo.DatosCompra;
import modelo.Producto;
import vista.VistaCompra;

import java.util.ArrayList;

public class ControladorCompra implements IControladorCompra{
    private ArrayList<Producto> productos;
    private DatosCompra datosCompra;
    private VistaCompra vistaCompra;
    private double pago;
    public ControladorCompra(){
        productos = new ArrayList<>();
    }

    @Override
    public void agregarPago(double monto) {
        this.pago += monto;
    }

    @Override
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public void limpiar() {

    }

    @Override
    public void actualizarVista() {

    }
}
