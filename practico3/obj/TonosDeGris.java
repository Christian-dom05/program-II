package practico3.obj;

import practico3.obj.Imagen;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TonosDeGris implements IOperacionImagen{
    private Imagen target;
    private static final Logger logger = LogManager.getRootLogger();
    public TonosDeGris(Imagen imagen){
        this.target = imagen;
    }

    @Override
    public void ejecutar() {
        Imagen resultado = new Imagen(target.getAncho(), target.getAlto());
        logger.info("Se crea nuevo instancia de Imagen");

        for (int i = 0; i < target.getAncho(); i++) {
            for (int j = 0; j < target.getAlto(); j++) {
                int r = target.getR(i,j);
                int g = target.getG(i,j);
                int b = target.getB(i,j);
                int gris = (r + g + b) / 3;
                resultado.setPixel(i,j, gris, gris, gris);
            }
        }

        target.setPixeles(resultado.getAncho(), resultado.getAlto(),
                resultado.getPixeles());
        logger.info("Se pasò la nueva matriz al metodo setPixeles de la instancia "+target.toString());
    }
}
