package practico3.gui;

import practico3.obj.Imagen;

import javax.swing.*;
import java.awt.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Clase donde se recibe el objeto Imagen y se pinta en el JPanel
 */
public class ImagenPanel extends JPanel {
    private Imagen modelo;
    private static final Logger logger = LogManager.getRootLogger();
    public ImagenPanel(Imagen modelo){
        this.modelo = modelo;
        logger.info("Se recibió objeto tipo Imagen");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        logger.info("Se dibujó la imagen en "+ this.toString());
        modelo.dibujar(g);
    }
}
