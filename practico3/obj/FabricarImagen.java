package practico3.obj;

import imagenes.obj.FabricaImagen;
import practico3.obj.Imagen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FabricarImagen {
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
        try{
            File f = new File(nombreArchivo);
            bi = ImageIO.read(f);
        }catch (IOException e){
            e.printStackTrace();
        }

        int w = bi.getWidth();
        int h = bi.getHeight();

        Imagen resultado = new Imagen(w,h);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                resultado.setPixel(i, j, bi.getRGB(i, j));
            }
        }

        return resultado;
    }
}
