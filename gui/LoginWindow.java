package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginWindow() {
        setTitle("Inicio de Sesion");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(50, 50, 80, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(130, 50, 200, 25);
        add(usernameField);

        JLabel passLabel = new JLabel("Contraseña:");
        passLabel.setBounds(50, 90, 80, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 90, 200, 25);
        add(passwordField);

        loginButton = new JButton("Iniciar Sesion");
        loginButton.setBounds(130, 140, 120, 30);
        loginButton.addActionListener(this);
        add(loginButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = usernameField.getText().trim();
        String contra = new String(passwordField.getPassword());

        if (user.equals("admin") && contra.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Bienvenido, " + user + "!");

            VentanaEstudiante ventanaEstudiante = new VentanaEstudiante();
            ventanaEstudiante.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginWindow::new);
    }
}