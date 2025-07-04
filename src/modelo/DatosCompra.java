package modelo;

import java.util.ArrayList;
import java.util.List;

public class DatosCompra implements IDatosCompra{
    private ArrayList<Producto> p;
    private double total;
    private double pagado;
    private double cambio;
    private double pago;
    public DatosCompra(){
    }
    @Override
    public void agregarProducto(Producto p) {
        this.p.add(p);
    }

    @Override
    public void limpiar() {

    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public double getPagado() {
        return 0;
    }

    @Override
    public void agregarPago(double monto) {
        pago = monto;
        total += monto;
    }

    @Override
    public double getCambio() {
        cambio = total- pagado;
        return cambio;
    }

    @Override
    public List<Producto> getProductos() {
        return null;
    }

    @Override
    public String toString() {
        return p.toString();
    }
}
