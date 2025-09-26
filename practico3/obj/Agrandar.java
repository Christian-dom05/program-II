package practico3.obj;

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
        logger.info("Se pasa la dimension de la imagen original: ancho: "+target.getAncho()+" | alto: "+target.getAlto());

        int wf = (wo * porcentaje) / 100;
        int hf = (ho * porcentaje) / 100;
        logger.info("Se cambia la dimension de la imagen original: ancho: "+wf+" | alto: "+hf);

        Imagen resultado = new Imagen(wf, hf);
        logger.info("Se crea nuevo instancia de Imagen en clase "+this.toString());

        for (int i = 0; i < wf; i++) {
            for (int j = 0; j < hf; j++) {
                int xOriginal = i * 100 / porcentaje;
                int yOriginal = j * 100 / porcentaje;

                resultado.setPixel(i, j, target.get(xOriginal, yOriginal));
            }
        }

        target.setPixeles(wf, hf, resultado.getPixeles());
        logger.info("Se pasò la nueva matriz al metodo setPixeles de la instancia "+target.toString());
    }
}
