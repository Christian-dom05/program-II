package ejemplosConPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MovimientoTeclado extends JPanel {
    private int x = 100, y = 100;
    public MovimientoTeclado(){
        setFocusable(true); //cuando se use teclado en un panel, se usa este método para escuchar al panel
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                int velocidad = 10;

                switch (key){
                    case KeyEvent.VK_LEFT:
                        x -= velocidad;
                        break;
                    case KeyEvent.VK_RIGHT:
                        x += velocidad;
                        break;
                    case KeyEvent.VK_UP:
                        y -= velocidad;
                        break;
                    case KeyEvent.VK_DOWN:
                        y += velocidad;
                        break;
                }
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillOval(x,y,50,50);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de gráficos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500,500);
        ventana.add(new MovimientoTeclado());
        ventana.setVisible(true);
    }
}
