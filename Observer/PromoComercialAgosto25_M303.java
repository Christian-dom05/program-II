package Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Promoción comercial del 5%
 */
public class PromoComercialAgosto25_M303 implements PropertyChangeListener {
    private static final Logger logger = LogManager.getRootLogger();
    private final CuentaBanco cuenta;
    public PromoComercialAgosto25_M303(CuentaBanco cta){
        this.cuenta = cta;
        this.cuenta.nuevoObservador(this);
    }

    public void ejecutar(float monto){
        float promo = monto * 0.05f;
        this.cuenta.depositoInterno(promo);
        logger.info("Se aplico la promo comercial Agosto25_M303, beneficio de " + promo)
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        float anterior = (float)evt.getOldValue();
        float actual = (float)evt.getNewValue();

        float diferencia = actual - anterior;
        if(diferencia > 0){
            ejecutar(diferencia);
        }
    }
}
