package eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeerTextoBoton implements ActionListener {
    JButton botonLeer;
    JTextField campoTexto;
    JFrame ventana;
    public LeerTextoBoton(){
        ventana = new JFrame("Leer texto con botón");
        ventana.setSize(400,400);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        campoTexto = new JTextField();
        campoTexto.setBounds(50,30,180,30);

        botonLeer = new JButton("Leer texto");
        botonLeer.setBounds(50,80,180,30);
        botonLeer.addActionListener(this);

        ventana.add(campoTexto);
        ventana.add(botonLeer);

        ventana.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String texto = campoTexto.getText();
        JOptionPane.showMessageDialog(ventana,"Texto ingresado: "+texto);
        System.out.println("Texto leído: "+texto);
    }

    public static void main(String[] args) {
        new LeerTextoBoton();
    }
}
