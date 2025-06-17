package simulador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class SimuladorDeColisiones extends JPanel implements ActionListener {
    private int widthCuadrado, heigthCuadrado, positionXRival, positionYRival, widthPanel, heigthPanel;
    private Random random;
    private CuadradosRivales cuadradosRivales;
    private boolean crearRival;
    private ArrayList<CuadradosRivales> enemigos;
    private int velocidadRival, velocidadJugador;

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    private Timer crearEnemigo;
    private Timer actualizarJuego;

    public SimuladorDeColisiones(){
        this.random = new Random();
        actualizarJuego = new Timer(20,this);
        crearEnemigo = new Timer(2000,e -> crearEnemigo()); // crea enemigo cada dos segundos
        enemigos = new ArrayList<>();

        this.velocidadRival = 6;
        this.velocidadJugador = 8;
        this.crearRival = false;
        this.widthCuadrado = 50;
        this.heigthCuadrado = 50;
        //this.widthPanel = getWidth();
        //this.heigthPanel = getHeight();
        this.positionXRival = getWidth();
        this.positionYRival = random.nextInt(getHeight());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Cuadrado
        g.fillRect(positionXRival, positionYRival, widthCuadrado, heigthCuadrado);
        g.setColor(Color.RED);

        g.setColor(Color.BLUE);
        for(CuadradosRivales c: enemigos){
            g.fillRect(positionXRival, positionYRival, widthCuadrado, heigthCuadrado);
        }

    }

    public void crearEnemigo(){
        enemigos.add(new CuadradosRivales(positionXRival, positionYRival));

    }

    public void juego(){
        Iterator<CuadradosRivales> it = enemigos.iterator();

        while(it.hasNext()){
            cuadradosRivales = it.next();


        }
    }
}
