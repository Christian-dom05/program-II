package practico3.obj;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FabricarImagen {
    private static final Logger logger = LogManager.getRootLogger();
    /**
     * implementación del patrón de diseño Factory
     */
    public FabricarImagen(){}

    /**
     * Método en donde llega un archivo, se crea un objeto tipo Imagen, se itera y
     * se traspasa los píxeles al objeto tipo Imagen. Se usa la clase BufferedImage
     * para leer el archivo
     * @param nombreArchivo
     * @return
     */
    public Imagen fabricarImagenDesdeArchivo(String nombreArchivo){
        BufferedImage bi = null;
        logger.info("Se crea instancia de clase BufferedImage y se inicializa en valor null en la clase "+ this.toString());
        try{
            File f = new File(nombreArchivo);
            bi = ImageIO.read(f);
        }catch (IOException e){
            e.printStackTrace();
        }

        int w = bi.getWidth();
        int h = bi.getHeight();
        logger.info("Se da el valor del ancho de la imagen en la variable w");
        logger.info("Se da el valor del alto de la imagen en la variable h");

        Imagen resultado = new Imagen(w,h);
        logger.info("Se crea nuevo instancia de Imagen en clase "+this.toString());
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                resultado.setPixel(i, j, bi.getRGB(i, j));
            }
        }

        logger.info("Pasamos la imagen en "+this.toString());
        return resultado;
    }
}
