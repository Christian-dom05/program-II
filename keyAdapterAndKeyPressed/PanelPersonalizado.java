package keyAdapterAndKeyPressed;

import javax.swing.*;
import java.awt.*;

public class PanelPersonalizado extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(50,50,100,100);

        g.setColor(Color.RED);
        g.fillRect(50,140,100,50);

        g.setColor(Color.CYAN);
        g.drawLine(50,200,200,200);

        int[] xPoint={250,300,350};
        int[] yPoint={200,150,200};
        g.setColor(Color.YELLOW);
        g.fillPolygon(xPoint, yPoint,3);

        // Dibujar texto
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial",Font.ITALIC,16));
        g.drawString("¡Dibujo personalizado!",50,300);
    }
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        PanelPersonalizado panel = new PanelPersonalizado();
        ventana.setSize(400,400);
        ventana.add(panel);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
