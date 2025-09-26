package practico3.obj;

import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Imagen {
    private int pixeles[][];
    private int ancho;
    private int alto;
    private PropertyChangeSupport observado;
    public Imagen(int ancho, int alto){
        pixeles = new int[ancho][alto];
        this.ancho = ancho;
        this.alto = alto;
        this.observado = new PropertyChangeSupport(this);
    }
    public void addObservador(PropertyChangeListener observador) {
        observado.addPropertyChangeListener(observador);
    }

    public void setPixel(int x, int y, int r, int g, int b) {
        pixeles[x][y] = (r << 16) | (g << 8) | b;
    }

    public void setPixel(int x, int y, int c) {
        pixeles[x][y] = c;
    }

    public void setPixeles(int w, int h, int[][] nuevosPixeles) {
        observado.firePropertyChange("IMAGEN", pixeles,nuevosPixeles);
        pixeles = nuevosPixeles;
        ancho = w;
        alto = h;
    }

    public int get(int x, int y) {
        return pixeles[x][y];
    }

    public void setTamanoPixeles(int w, int h){
        ancho = w;
        alto = h;
    }
    public int getR(int x, int y) {
        return pixeles[x][y] >> 16;
    }
    public int getG(int x, int y) {
        return (0x0000FFFF & pixeles[x][y]) >> 8;
    }
    public int getB(int x, int y) {
        return (0x000000FF & pixeles[x][y]);
    }

    public int[][] getPixeles() {
        return pixeles;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void dibujar(Graphics g) {
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                g.setColor(new Color(pixeles[i][j]));
                g.drawLine(i, j, i, j);
            }
        }
    }
}
