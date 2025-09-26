package practico3.obj;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Agrandar implements IOperacionImagen{
    private Imagen target;
    private int porcentaje;
    private static final Logger logger = LogManager.getRootLogger();

    public Agrandar(Imagen target, int porcentaje){
        logger.info("Se recibió " + target.toString() + " y porcentaje");
        this.target = target;
        this.porcentaje = porcentaje;
    }

    /**
     * Metodo donde se agranda la imagen
     * wo y ho guardan el ancho y alto original de la imagen
     * Se crea una instancia de imagen y se le asignan nuevas dimensiones (hNew y wNew)
     *
     */
    @Override
    public void ejecutar() {
        int wo = target.getAncho();
        int ho = target.getAlto();

        int wNew = (wo * porcentaje) / 100;
        int hNew = (ho * porcentaje) / 100;

        Imagen resultado = new Imagen(wNew, hNew);

        for (int i = 0; i < wNew; i++) {
            for (int j = 0; j < hNew; j++) {
                int xOriginal = i * 100 / porcentaje;
                int yOriginal = j * 100 / porcentaje;

                xOriginal = Math.min(xOriginal, wo - 1);
                yOriginal = Math.min(yOriginal, ho - 1);

                resultado.setPixel(i, j, target.get(xOriginal, yOriginal));
            }
        }

        target.setPixeles(wNew, hNew, resultado.getPixeles());
    }
}
