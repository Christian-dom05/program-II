package keyAdapterAndKeyPressed;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.RecursiveTask;

public class ketAdapterExample{
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyAdapter Example");
        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("key Pressed: "+KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("key Released: "+KeyEvent.getKeyText(e.getKeyCode()));
            }
        });
        frame.add(textField);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
