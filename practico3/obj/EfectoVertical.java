package practico3.obj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EfectoVertical implements IOperacionImagen {
    private int pixelesInvertidos[][];
    private int pixeles[][];
    private Imagen imagen;
    private static final Logger logger = LogManager.getRootLogger();
    private int h;
    private int w;
    public EfectoVertical(Imagen imagen){
        this.imagen = imagen;
        pixeles = imagen.getPixeles();
        logger.info("Se guardó ");
    }
    @Override
    public void ejecutar() {
        h = imagen.getAncho();
        w = imagen.getAlto();

        // creamos una matriz invertida
        pixelesInvertidos = new int[w][h];

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                pixelesInvertidos[i][j] = pixeles[j][i];
            }
        }
        imagen.setPixeles(w,h,pixelesInvertidos);
        logger.info("Se pasò la nueva matriz al metodo setPixeles de la instancia "+imagen.toString());
    }
}
