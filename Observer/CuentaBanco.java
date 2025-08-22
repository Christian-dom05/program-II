package Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Promo
 */
public class CuentaBanco {
    private static final Logger logger = LogManager.getRootLogger();
    private String cliente;
    private float saldo;
    private PropertyChangeSupport observado;

    public CuentaBanco(String cliente, float saldo){
        this.cliente = cliente;
        this.saldo = saldo;
        this.observado = new PropertyChangeSupport(this);
        logger.info("Creada la cuenta: "+this.toString());
    }

    public void nuevoObservador(PropertyChangeListener observador){
        this.observado.addPropertyChangeListener(observador);
        logger.info("Objeto cuenta con un nuevo observador: " + observador.toString());
    }
    public String getCliente() {
        return cliente;
    }

    public float getSaldo() {
        return saldo;
    }
    public void deposito(float monto){
        float saldoAnterior = this.saldo;
        this.saldo += monto;
        logger.info("Se depositó " + monto + "Bs. El saldo cambio de " + saldoAnterior + " a " + saldo);
        observado.firePropertyChange("MONTO", saldoAnterior,saldo); // Notifica
    }
    public void retiro(float monto){
        float saldoAnterior = this.saldo;
        this.saldo -= monto;
        logger.info("Se retiró " + monto + "Bs. El saldo cambio de " + saldoAnterior + " a " + saldo);
        observado.firePropertyChange("MONTO",saldoAnterior,saldo); //Itera sobre la lista de observadores y llama a PropoertyChange
    }

    @Override
    public String toString() {
        return cliente + " tiene en su cuenta " + saldo + "Bs";
    }

    public void depositoInterno(float promo) {
        this.saldo += promo;
    }
}
