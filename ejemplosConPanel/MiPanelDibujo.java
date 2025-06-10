package ejemplosConPanel;

import javax.swing.*;
import java.awt.*;

public class MiPanelDibujo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.RED);
        g2d.fillRect(50,50,100,60);

        g2d.setColor(Color.BLUE);
        g2d.fillOval(200,50,100,40);

        g2d.setColor(Color.BLACK);
        g2d.drawString("Esto es un texto",50,150);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de gráficos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500,500);
        ventana.add(new MiPanelDibujo());
        ventana.setVisible(true);
    }
}
