package simulador;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class CuadradosRivales{
    private int widthCuadrado, heigthCuadrado, positionX, positionY, widthPanel, heigthPanel;
    Random random;
    public CuadradosRivales(int positionX, int positionY){
        this.random = new Random();
        this.widthCuadrado = 50;
        this.heigthCuadrado = 50;

        this.positionX = positionX;
        this.positionY = positionY;
    }
}
