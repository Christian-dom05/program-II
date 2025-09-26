package practico3.gui;

import practico3.obj.*;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Ventana principal del software
 */

public class WinImagen extends JFrame implements PropertyChangeListener {
    private Imagen modelo;
    private ImagenPanel imagenPanel;
    private static final Logger logger = LogManager.getRootLogger();
    public WinImagen(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // leemos bit a bit una imagen con la instancia del objeto FabricarImagen
        // y la guardamos en la instancia de Imagen
        FabricarImagen fabricarImagen = new FabricarImagen();
        logger.info("Creamos instancia de "+fabricarImagen.toString());
        modelo = fabricarImagen.fabricarImagenDesdeArchivo("C:\\Users\\M-303-6\\Pictures\\zorrito.jpg");
        logger.info("se inicializó la instancia de "+modelo.toString());

        modelo.addObservador(this);
        logger.info(WinImagen.this.toString() + " se convirtió en observador de "+ modelo.toString());

        imagenPanel = new ImagenPanel(modelo);
        logger.info("Se pasó la instancia " + modelo.toString() + " a travès del constructor de "+imagenPanel.toString());

        setLayout(new BorderLayout());
        add(imagenPanel, BorderLayout.CENTER);

        //---------------Opciones de usuario-------------------------

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Transformaciones");
        JMenuItem item = new JMenuItem("Tonos de gris");
        item.addActionListener(e -> menuTransformaciones_tonosDeGris());
        menu.add(item);
        logger.info("Se añadió JMenuItem (Transformaciones) a JMenu");

        item = new JMenuItem("Achicar 50%");
        item.addActionListener(e -> menuTransformaciones_achicar50());
        menu.add(item);
        logger.info("Se añadió JMenuItem (Achicar 50%) a JMenu");

        item = new JMenuItem("Vertical");
        item.addActionListener(e -> menuTransformaciones_Vertical());
        menu.add(item);
        logger.info("Se añadió JMenuItem (Vertical) a JMenu");

        item = new JMenuItem("Horizontal");
        item.addActionListener(e -> menuTransformaciones_Horizontal());
        menu.add(item);
        logger.info("Se añadió JMenuItem (Horizontal) a JMenu");

        item = new JMenuItem("Blanco y negro");
        item.addActionListener(e -> menuTransformaciones_BlancoYNegro());
        menu.add(item);
        logger.info("Se añadió JMenuItem (Blanco y Negro) a JMenu");

        item = new JMenuItem("Agrandar");
        item.addActionListener(e -> menuTransformaciones_Agrandar());
        menu.add(item);
        logger.info("Se añadió JMenuItem (Agrandar) a JMenu");

        //-----------------------------------------------------------------------------

        bar.add(menu);
        setJMenuBar(bar);

        setSize(800,800);
        setVisible(true);
    }

    /**
     * Metodos que responden a eventos dando distintas formas de imágenes
     */

    private void menuTransformaciones_Horizontal() {
        IOperacionImagen operacion = new EfectoHorizontal(modelo);
        operacion.ejecutar();
    }

    private void menuTransformaciones_Agrandar() {
        IOperacionImagen operacion = new Agrandar(modelo,200);
        operacion.ejecutar();
    }

    private void menuTransformaciones_BlancoYNegro() {
        IOperacionImagen operacion = new BlancoYNegro(modelo);
        operacion.ejecutar();
    }

    private void menuTransformaciones_achicar50() {
        IOperacionImagen operacion = new Achicar(modelo, 50);
        operacion.ejecutar();
    }

    private void menuTransformaciones_tonosDeGris() {
        IOperacionImagen operacion = new TonosDeGris(modelo);
        operacion.ejecutar();
    }

    private void menuTransformaciones_Vertical() {
        IOperacionImagen operacion = new EfectoVertical(modelo);
        operacion.ejecutar();
    }
    //-----------------------------------------

    /**
     * Ejecuta repaint cada vez que un observado notifique al observador
     * @param evt A PropertyChangeEvent object describing the event source
     *          and the property that has changed.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        imagenPanel.repaint();
    }


    /**
     * Metodo principal, donde inicia el programa
     * @param args
     */
    public static void main(String[] args) {
        new WinImagen();
    }
}
