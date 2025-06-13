package ejemplosConPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploTimer implements ActionListener {
    private Timer timer;
    private int contador = 0;
    public EjemploTimer(){
        timer = new Timer(1000,this /*escuche al actionPerformed dentro de la clase */);
        timer.start();
        JOptionPane.showMessageDialog(null,"Presiona OK para terminar");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        contador++;
        System.out.println("Contador: " + contador);
        if(contador >= 5){
            timer.stop();
            System.out.println("Timer detenido");
        }
    }

    public static void main(String[] args) {
        new EjemploTimer();
    }
}
