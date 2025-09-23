package practico3.gui;

import imagenes.obj.Achicar;
import imagenes.obj.IOperacionImagen;
import imagenes.obj.TonosDeGris;
import practico3.obj.Imagen;

import javax.swing.*;
import java.awt.*;

public class ImagenPanel extends JPanel {
    private Imagen modelo;
    private JMenuBar bar;
    public ImagenPanel(Imagen modelo){
        this.modelo = modelo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        modelo.dibujar(g);
    }
}
