package ui;

import models.Cafeteria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinProducto extends JDialog {

    private Cafeteria cafeteria;
    private JLabel codigoLabel,nombreLabel,precioLabel;
    private JTextField codigoField, nombreField, precioField;
    private JButton guardarBtn;
    public WinProducto(Cafeteria cafeteria, JFrame parent) {
        super(parent, true);
        this.cafeteria = cafeteria;

        setSize(500,300);
        setLayout(null);
        //setLocationRelativeTo(null);

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

        precioLabel = new JLabel("Precio: ");
        precioLabel.setBounds(30,120,80,25);
        add(precioLabel);

        precioField = new JTextField();
        precioField.setBounds(160,120,120,25);
        add(precioField);

        guardarBtn = new JButton("Guardar");
        guardarBtn.setBounds(200,160,80,30);
        guardarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String codigo = codigoField.getText().trim();
                    String nombre = nombreField.getText().trim();
                    double precio = Double.parseDouble(precioField.getText().trim());
                    System.out.println(precio);
                    if(!codigo.equals("") && !nombre.equals("")){
                        cafeteria.registrarProducto(codigo,nombre,precio);
                        System.out.println("Boton guardar presionado");
                        JOptionPane.showMessageDialog(parent,"Producto añadido correctamente");
                    } else {
                        JOptionPane.showMessageDialog(parent,"Debe llenar todos los campos","Error.",JOptionPane.WARNING_MESSAGE);
                    }
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(parent,"Debe ingresar un número en el campo 'precio'","Error.",JOptionPane.WARNING_MESSAGE);
                }

                codigoField.setText("");
                nombreField.setText("");
                precioField.setText("");
            }
        });
        add(guardarBtn);
        //Al momnento de guardar el producto, se debe llamar al método registrarProducto de la cafetería
        //Ejemplo: cafeteria.registrarProducto("123", "Cafe Americano", 12.0);
    }

    /*private void GuardarBtnActionPerformed(java.awt.event.ActionEvent e){
        String codigo = codigoField.getText();
        String nombre = nombreField.getText();
        double precio = Double.parseDouble(precioField.getText());
        cafeteria.registrarProducto(codigo,nombre,precio);
        System.out.println("Boton guardar presionado");
        JOptionPane.showMessageDialog(this,"Producto añadido correctamente");
    }*/
}
