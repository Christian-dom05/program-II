package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos extends JFrame implements ActionListener {
    JButton boton;
    public Eventos(){
        boton = new JButton("Haz click");
        boton.addActionListener(this);
        add(boton);
        setSize(300,200);
        setLayout(null);
        boton.setBounds(100,80,100,40);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Boton clicado");
        boton.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        new Eventos();
    }
}
