package keyAdapterAndKeyPressed;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;

public class EjemploClase{
    private static int x = 100;
    private static int y = 100;
    private static int width = 50;
    private static int heigth = 50;
    private static int speed= 10;
    EjemploClase(){
        JFrame ventana = new JFrame();
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillOval(x,y,width,heigth);

                g.setColor(Color.RED);
                g.fillOval(x+(heigth/4),y+(width/4),width/2,heigth/2);
            }
        };
        panel.setFocusable(true);
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP) {
                    y -= speed;
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    y += speed;
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    x -= speed;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    x += speed;
                }
                panel.repaint();
            }
        });
        ventana.setSize(400,400);
        ventana.add(panel);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    public static void main(String[] args) {
        new EjemploClase();
    }
}
