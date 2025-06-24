package claseAnonima;

import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClaseAnonima {
    public static void main(String[] args) {
        /*Operacion suma = new Operacion() {
            @Override
            public double calcular(double a, double b) {
                return a+b;
            }
        };
        Operacion resta = new Operacion() {
            @Override
            public double calcular(double a, double b) {
                return a-b;
            }
        };*/

        Operacion suma = (a, b) -> a + b; //Lambda
        Operacion resta = (a, b) -> a - b; //Lambda
        Saludar s = (nombre) -> System.out.println("Hola " + nombre); //Lambda
        s.decir("Ana");

        System.out.println("Suma: " + suma.calcular(2, 6));
        System.out.println("Resta: " + resta.calcular(10, 4));

        JButton boton1 = new JButton("Anónima");
        boton1.setBounds(20,30,40,25);

        JButton boton2 = new JButton("Lambda");
        boton2.setBounds(70,30,40,25);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boton presionado (Anónimo)");
            }
        });

        boton2.addActionListener( e -> System.out.println("Boton presionado (Lambda)"));

        JFrame frame = new JFrame("Prueba");
        frame.setLayout(null);
        frame.add(boton1);
        frame.add(boton2);
        frame.setSize(150,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
