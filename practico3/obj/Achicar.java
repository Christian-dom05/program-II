package practico3.obj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * En esta clase, se recibe la imagen y el porcentaje en el constructor
 *
 */
public class Achicar implements IOperacionImagen{
    private Imagen target;
    private int porcentaje;
    private static final Logger logger = LogManager.getRootLogger();
    public Achicar(Imagen target, int porcentaje){
        logger.info("Se recibió " + target.toString() + " y porcentaje");
        this.target = target;
        this.porcentaje = porcentaje;
    }

    /**
     * En este método se reducen las dimensiones de la imagen en las variables wf (width final) y hf (heigth final)
     * Se modifica el tamaño de los pixeles usando el método SetTamanoPixeles
     * Se crea nueva instancia de Imagen con las nuevas dimensiones
     */
    public void ejecutar() {
        logger.info("Se crean las variables wf y hf");
        int wf = (target.getAncho() * this.porcentaje) / 100;
        int hf = (target.getAlto() * this.porcentaje) / 100;
        logger.info("Las variables wf y hf reciben la dimension final de la imagen");

        target.setTamanoPixeles(wf, hf);

        Imagen resultado = new Imagen(wf, hf);
        logger.info("Se crea instancia de Imagen con las nuevas dimensiones");
        for (int i = 0; i < wf; i++) {
            for (int j = 0; j < hf; j++) {
                int xImagenOriginal = i * 100 / porcentaje;
                int yImagenOriginal = j * 100 / porcentaje;

                resultado.setPixel(i, j, target.get(xImagenOriginal, yImagenOriginal));
            }
        }

        logger.info("Se modifica la imagen, dandole los valores wf, hf y la nueva matriz");
        target.setPixeles(wf, hf, resultado.getPixeles());
    }
}
