package control.primerEjercicio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PooYClaseAnonima extends JPanel{
    private JButton btnControlFacilito;
    private JTextField fieldNombre;
    private JLabel lblControlFacilito, lblBienvenido;
    public PooYClaseAnonima(){
        setLayout(null);

        fieldNombre = new JTextField();
        fieldNombre.setBounds(30,40,100,30);
        add(fieldNombre);

        lblControlFacilito = new JLabel("Control");
        lblControlFacilito.setBounds(30,70,100,30);
        add(lblControlFacilito);

        btnControlFacilito = new JButton("Actualizar");
        btnControlFacilito.setBounds(150,70,100,30);
        btnControlFacilito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre;
                nombre = fieldNombre.getText();

                lblBienvenido.setText("Bienvenido: "+nombre);
                lblControlFacilito.setText("Control facilito");
            }
        });
        add(btnControlFacilito);

        lblBienvenido = new JLabel("");
        lblBienvenido.setBounds(280,70,160,30);
        add(lblBienvenido);
    }

    public static void main(String[] args) {
        PooYClaseAnonima pooYClaseAnonima = new PooYClaseAnonima();

        JFrame ventana = new JFrame("control");
        ventana.setSize(500,300);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.add(pooYClaseAnonima);
        ventana.setVisible(true);

    }
}
