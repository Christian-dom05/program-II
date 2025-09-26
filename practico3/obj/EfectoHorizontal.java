package practico3.obj;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EfectoHorizontal implements IOperacionImagen{
    private Imagen target;
    private static final Logger logger = LogManager.getRootLogger();
    private int[][] matrizHorizontal;
    private int[][] matrizOriginal;
    private int h,w;
    public EfectoHorizontal(Imagen imagen){
        this.target = imagen;
        logger.info("Se guardó ");
    }
    @Override
    public void ejecutar() {
        w = target.getAncho();
        h = target.getAlto();
        logger.info("Se guardó el ancho y alto de la imagen en las variables w y h");

        Imagen resultado = new Imagen(w,h);
        logger.info("Se creó una nueva instancia de "+Imagen.class.toString());

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                resultado.setPixel(i, j, target.get(w - 1 - i, j));
            }
        }
        target.setPixeles(w,h, resultado.getPixeles());
        logger.info("Se pasò la nueva matriz al metodo setPixeles de la instancia "+target.toString());
    }
}
