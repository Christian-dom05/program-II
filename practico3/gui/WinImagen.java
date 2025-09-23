package practico3.gui;

import practico3.obj.*;

import javax.swing.*;
import java.awt.*;

public class WinImagen extends JFrame {
    private Imagen modelo;
    private ImagenPanel imagenPanel;
    public WinImagen(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        FabricarImagen fabricarImagen = new FabricarImagen();
        modelo = fabricarImagen.fabricarImagenDesdeArchivo("C:\\Users\\HP\\Desktop\\imagenes\\PechaKucha\\procrastinaciononce.jpg");

        /*int ancho = modelo.getAncho();
        int alto = modelo.getAlto();
         */
        imagenPanel = new ImagenPanel(modelo);

        setLayout(new BorderLayout());
        add(imagenPanel, BorderLayout.CENTER);

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Transformaciones");
        JMenuItem item = new JMenuItem("Tonos de gris");
        item.addActionListener(e -> menuTransformaciones_tonosDeGris());
        menu.add(item);

        item = new JMenuItem("Achicar 50%");
        item.addActionListener(e -> menuTransformaciones_achicar50());
        menu.add(item);

        item = new JMenuItem("Vertical");
        item.addActionListener(e -> menuTransformaciones_Vertical());
        menu.add(item);

        item = new JMenuItem("Horizontal");
        item.addActionListener(e -> menuTransformaciones_Horizontal());
        menu.add(item);

        item = new JMenuItem("Blanco y negro");
        item.addActionListener(e -> menuTransformaciones_BlancoYNegro());
        menu.add(item);

        item = new JMenuItem("Agrandar");
        item.addActionListener(e -> menuTransformaciones_Agrandar());
        menu.add(item);

        bar.add(menu);
        setJMenuBar(bar);

        setSize(800,800);
        setVisible(true);
    }

    private void menuTransformaciones_Horizontal() {
        IOperacionImagen operacion = new EfectoHorizontal(modelo);
        operacion.ejecutar();
        imagenPanel.repaint();
    }

    private void menuTransformaciones_Agrandar() {
        IOperacionImagen operacion = new Agrandar(modelo,200);
        operacion.ejecutar();
        imagenPanel.repaint();
    }

    private void menuTransformaciones_BlancoYNegro() {
        IOperacionImagen operacion = new BlancoYNegro(modelo);
        operacion.ejecutar();
        imagenPanel.repaint();
    }

    private void menuTransformaciones_achicar50() {
        IOperacionImagen operacion = new Achicar(modelo, 50);
        operacion.ejecutar();
        imagenPanel.repaint();
    }

    private void menuTransformaciones_tonosDeGris() {
        IOperacionImagen operacion = new TonosDeGris(modelo);
        operacion.ejecutar();
        imagenPanel.repaint();
    }

    private void menuTransformaciones_Vertical() {
        IOperacionImagen operacion = new EfectoVertical(modelo);
        operacion.ejecutar();
        imagenPanel.repaint();

    }

    public static void main(String[] args) {
        new WinImagen();
    }
}
