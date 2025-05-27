package paneles;

import javax.swing.*;

import java.awt.*;

import static javax.swing.BoxLayout.Y_AXIS;

public class Panel1 extends JPanel {
    public Panel1(){
        setSize(400,400);
        setLayout(new GridLayout(5,1));
        setBackground(Color.YELLOW);

        JLabel labelInicioSesion = new JLabel("Inicio de Sesión");
        JLabel correo = new JLabel("Correo");
        JTextField textCorreo = new JTextField();
        JLabel contrasenha = new JLabel("Contraseña");
        JPasswordField fieldContra = new JPasswordField();

        labelInicioSesion.setLocation(40,100);
        //labelInicioSesion.setFont("Arial",Font.BOLD,10);
        correo.setLocation(10,200);
        textCorreo.setLocation(40,200);
        contrasenha.setLocation(10,280);
        fieldContra.setLocation(40,280);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Panel1();
    }
}
