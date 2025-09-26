package practico3.obj;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlancoYNegro implements IOperacionImagen{
    private Imagen target;
    private static final Logger logger = LogManager.getRootLogger();
    public BlancoYNegro(Imagen imagen) {
        logger.info("Se recibió instancia de tipo Imagen: ");
        this.target = imagen;
    }
    @Override
    public void ejecutar() {
        Imagen resultado = new Imagen(target.getAncho(), target.getAlto());
        logger.info("Se crea nuevo instancia de Imagen en clase "+this.toString());

        for (int i = 0; i < target.getAncho(); i++) {
            for (int j = 0; j < target.getAlto(); j++) {
                int r = target.getR(i,j);
                int g = target.getG(i,j);
                int b = target.getB(i,j);
                int res = (r + g + b) / 3;
                if(res >= 128){
                    resultado.setPixel(i,j,255,255,255);
                }else {
                    resultado.setPixel(i,j, 0, 0, 0);
                }
            }
        }
        target.setPixeles(resultado.getAncho(), resultado.getAlto(),
                resultado.getPixeles());
        logger.info("Se pasò la nueva matriz al metodo setPixeles de la instancia "+target.toString());
    }
}
