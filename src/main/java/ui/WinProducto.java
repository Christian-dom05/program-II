package ui;

import models.Cafeteria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinProducto extends JDialog {

    private Cafeteria cafeteria;
    private JLabel codigoLabel,nombreLabel,cantidadLabel;
    private JTextField codigoField, nombreField, cantidadField;
    public WinProducto(Cafeteria cafeteria, JFrame parent) {
        super(parent, true);
        this.cafeteria = cafeteria;

        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);

        codigoLabel = new JLabel("Codigo: ");
        codigoLabel.setBounds(30,60,80,25);
        add(codigoLabel);

        codigoField = new JTextField();
        codigoField.setBounds(160,60,120,25);
        add(codigoField);

        nombreLabel = new JLabel("Nombre: ");
        nombreLabel.setBounds(30,90,80,25);
        add(nombreLabel);

        nombreField = new JTextField();
        nombreField.setBounds(160,90,120,25);
        add(nombreField);

        cantidadLabel = new JLabel("Cantidad");
        cantidadLabel.setBounds(30,120,80,25);
        add(cantidadLabel);

        cantidadField = new JTextField();
        cantidadField.setBounds(160,120,120,25);
        add(cantidadField);


        //Al momnento de guardar el producto, se debe llamar al método registrarProducto de la cafetería
        //Ejemplo: cafeteria.registrarProducto("123", "Cafe Americano", 12.0);
    }



}
