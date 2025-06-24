package eventos;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosSinExtends implements ActionListener{
    JButton boton1, boton2, boton3;
    JFrame ventana;
    public EventosSinExtends() {
        ventana = new JFrame("Ventana sin extends");
        ventana.setBounds(100, 100, 300, 500);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");

        boton1.setBounds(50, 50, 100, 40);
        boton2.setBounds(50, 110, 100, 40);
        boton3.setBounds(50, 170, 100, 40);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);

        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(boton3);

        ventana.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            JOptionPane.showMessageDialog(ventana, "Has presionado el boton 1");
            boton1.setBackground(Color.BLUE);
        } else if(e.getSource()==boton2){
            JOptionPane.showMessageDialog(ventana, "Has presionado el boton 2");
            boton2.setBackground(Color.GREEN);
        } else if (e.getSource()==boton3) {
            JOptionPane.showMessageDialog(ventana,"Has presionado el boton 3");
            boton3.setBackground(Color.yellow);
        }
    }

    public static void main(String[] args) {
        new EventosSinExtends();
    }
}
