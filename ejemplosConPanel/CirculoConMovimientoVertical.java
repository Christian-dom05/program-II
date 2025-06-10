package ejemplosConPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CirculoConMovimientoVertical extends JPanel implements ActionListener {
    private Timer timer;
    private int x = 200, y = -50,velocidad = 2;
    public CirculoConMovimientoVertical(){
        timer = new Timer(10,this /*escuche al actionPerformed dentro de la clase */);
        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // para mover el círculo de izquierda a derecha
        y += velocidad;
        if(y > getHeight()){
            y = -50;
        }
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y,50,50);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de gráficos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500,500);
        ventana.add(new CirculoConMovimientoVertical());
        ventana.setVisible(true);
    }
}
