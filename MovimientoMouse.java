package ejemplosConPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MovimientoMouse extends JPanel {
    private int x=100, y = 100;
    public MovimientoMouse(){
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.fillOval(x - 25, y - 25, 50, 50);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de gráficos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500,500);
        ventana.add(new MovimientoMouse());
        ventana.setVisible(true);
    }
}
