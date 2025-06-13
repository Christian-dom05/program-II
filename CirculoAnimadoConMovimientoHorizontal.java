package ejemplosConPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CirculoAnimadoConMovimientoHorizontal extends JPanel implements ActionListener {
    private Timer timer;
    private Cuadrado cuadrado;
    private int x = 0, y = 250, velocidad = 10;
    public CirculoAnimadoConMovimientoHorizontal(Cuadrado cuadrado){
        this.cuadrado = cuadrado;
        timer = new Timer(10,this /*escuche al actionPerformed dentro de la clase */);
        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // para mover el círculo de izquierda a derecha
        x += velocidad;
        if(x+25 > getWidth()){
            velocidad *= -1;
        }
        if ( x < 0){
            velocidad *= -1;
        }
        repaint();
    }

    // terminar
    public boolean colision(Cuadrado cuadrado){
        return true;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y,50,50);

        g.setColor(Color.BLACK);
        g.fillRect(400,250,50,50);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de gráficos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500,500);
        ventana.add(new CirculoAnimadoConMovimientoHorizontal());
        ventana.setVisible(true);
    }
}
