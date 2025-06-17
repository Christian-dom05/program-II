package simulador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Juego extends JPanel implements ActionListener, KeyListener {
    private ArrayList<Cuadrado> cuadrados;
    private Timer runJuego;
    private Timer generacionEnemigo;
    private int tamanoCuadrado = 50;
    private int widthCuadrado = 50;
    private int heigthCuadrado = 50;
    private int xPositionEnemy;
    private int yPositionEnemy;
    private int xPositionPlayer = 80;
    private int yPositionPlayer = 80;
    private Random randomY;
    private int velocidadEnemigo, velocidadJugador;
    private boolean juegoIniciado = false;
    private int anchoVentana = 700;
    private int altoVentana = 500;
    private boolean izquierda, derecha, arriba, abajo;

    public Juego(){
        cuadrados = new ArrayList<>();
        randomY = new Random();
        addKeyListener(this);

        generacionEnemigo = new Timer(2000, e -> generarEnemigo());
        generacionEnemigo.start();

        runJuego = new Timer(20,this);
        runJuego.start();

        this.juegoIniciado = true;

        /*this.izquierda = false;
        this.derecha = false;
        this.arriba = false;
        this.abajo = false;
*/
        setFocusable(true);

        this.xPositionEnemy = anchoVentana;

        this.velocidadEnemigo = 4;
        this.velocidadJugador = 6;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(xPositionPlayer, yPositionPlayer, tamanoCuadrado, tamanoCuadrado);

        g.setColor(Color.RED);
        for(Cuadrado cuadrado: cuadrados){
            g.fillRect(cuadrado.getxPosition(),cuadrado.getyPosition(),cuadrado.getTamanoCuadrado(),cuadrado.getTamanoCuadrado());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        runJuego();
        repaint();
    }

    public void generarEnemigo(){
        this.yPositionEnemy = randomY.nextInt(altoVentana-tamanoCuadrado);
        cuadrados.add(new Cuadrado(xPositionEnemy, yPositionEnemy,tamanoCuadrado));
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code){
            case KeyEvent.VK_LEFT:
                izquierda = true;
                break;
            case KeyEvent.VK_RIGHT:
                derecha = true;
                break;
            case KeyEvent.VK_UP:
                arriba = true;
                break;
            case KeyEvent.VK_DOWN:
                abajo = true;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT -> izquierda = false;
            case KeyEvent.VK_RIGHT -> derecha = false;
            case KeyEvent.VK_UP -> arriba = false;
            case KeyEvent.VK_DOWN -> abajo = false;
        }

    }

    public void runJuego(){
        if (izquierda){
            xPositionPlayer -= velocidadJugador;
        }
        if(derecha){
            xPositionPlayer += velocidadJugador;
        }
        if(arriba){
            yPositionPlayer -= velocidadJugador;
        }
        if(abajo){
            yPositionPlayer += velocidadJugador;
        }

        if((xPositionPlayer+tamanoCuadrado)< 50){
            xPositionPlayer = 0;
        }

        if((yPositionPlayer+tamanoCuadrado)<50){
            yPositionPlayer = 0;
        }

        if(xPositionPlayer > anchoVentana-tamanoCuadrado){
            xPositionPlayer = anchoVentana-tamanoCuadrado;
        }
        if(yPositionPlayer > altoVentana-tamanoCuadrado){
            yPositionPlayer = altoVentana-tamanoCuadrado;
        }
        Iterator<Cuadrado> iterator = cuadrados.iterator();
        while (iterator.hasNext()){
            Cuadrado enemigo = iterator.next();
            enemigo.setxPosition(velocidadEnemigo);
            if(enemigo.getxPosition() == 0-tamanoCuadrado){
                iterator.remove();
            }
        }



        if(intersectaCuadrado()){
            generacionEnemigo.stop();
            runJuego.stop();
            JOptionPane.showMessageDialog(this,"Game over", "perdiste",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        }
    }

    public boolean intersectaCuadrado(){
        Iterator<Cuadrado> iterator = cuadrados.iterator();
        while (iterator.hasNext()){
            Cuadrado enemigo = iterator.next();
            if(((yPositionPlayer-enemigo.getyPosition() < 50) && (yPositionPlayer-enemigo.getyPosition() > -50)) && ((xPositionPlayer-enemigo.getxPosition() < 50)&&(xPositionPlayer-enemigo.getxPosition() > -50))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Juego juego = new Juego();

        JFrame ventana = new JFrame("Simulador");
        ventana.setLocation(200,200);
        ventana.setSize(700,500);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.add(juego);
        ventana.setVisible(true);
    }
}
