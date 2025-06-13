package GUI;

import model.SecurityManagerImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class WinCambioContrasena extends JPanel implements ActionListener {
    private JLabel emailLabel, contrasenaActualLabel, nuevaContrasenaLabel;
    private JTextField emailField;
    private JPasswordField contrasenaActualField, nuevaContrasenaField;
    private JButton cambiarContrasenaBtn;
    private SecurityManagerImpl securityManager;

    public WinCambioContrasena(){
        setLayout(null);
        setVisible(true);
        emailLabel = new JLabel("Nombre:");
        emailLabel.setBounds(30,50,60,25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(60,50,80,25);
        add(emailField);

        contrasenaActualLabel = new JLabel("Contraseña actual:");
        contrasenaActualLabel.setBounds(30,80,60,25);
        add(contrasenaActualLabel);

        contrasenaActualField = new JPasswordField();
        contrasenaActualField.setBounds(90,80,80,25);
        add(contrasenaActualField);

        nuevaContrasenaLabel = new JLabel("Contraseña nueva:");
        nuevaContrasenaLabel.setBounds(30,110,60,25);
        add(nuevaContrasenaLabel);

        nuevaContrasenaField = new JPasswordField();
        nuevaContrasenaField.setBounds(90,110,80,25);
        add(nuevaContrasenaField);

        cambiarContrasenaBtn = new JButton("Cambiar Contrasena");
        cambiarContrasenaBtn.setBounds(40,140,70,30);
        cambiarContrasenaBtn.addActionListener(this);
        add(cambiarContrasenaBtn);
    }

    public void abrirWinCambioContrasena(){
        new WinCambioContrasena().setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String email = emailField.getText();
        String antiguaContra = Arrays.toString(contrasenaActualField.getPassword());
        String nuevaContra = Arrays.toString(nuevaContrasenaField.getPassword());

        if(cambiarContrasenaBtn.isSelected()){
            if(securityManager.cambiarContrasena(email,antiguaContra,nuevaContra)){
                JOptionPane.showMessageDialog(this,"Contraseña cambiada");
            } else {
                JOptionPane.showMessageDialog(this,"No se pudo cambiar contraseña", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        limpiarCampos();
    }

    public void limpiarCampos(){
        emailField.setText("");
        contrasenaActualField.setText("");
        nuevaContrasenaField.setText("");
    }
}
