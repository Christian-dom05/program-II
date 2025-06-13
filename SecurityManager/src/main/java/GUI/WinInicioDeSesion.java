package GUI;

import model.SecurityManagerImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinInicioDeSesion extends JPanel implements ActionListener {
    private JTextField nombreField, emailField;
    private JPasswordField contrasenaField;
    private JLabel nombreLabel, contrasenaLabel, emailLabel;
    private JButton iniciarSesionBtn, registrarCuentaBtn, cambiarContrasenaBtn, usuariosRegistradosBtn;
    private SecurityManagerImpl securityManager;
    private WinMenu winMenu;

    public WinInicioDeSesion(){
        setLayout(null);
        securityManager = new SecurityManagerImpl();
        //winMenu = new WinMenu();

        nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(30,50,60,25);
        add(nombreLabel);

        nombreField = new JTextField();
        nombreField.setBounds(80,50,80,25);
        add(nombreField);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30,90,60,25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(80,90,80,25);
        add(emailField);

        contrasenaLabel = new JLabel("Contraseña:");
        contrasenaLabel.setBounds(30,130,60,25);
        add(contrasenaLabel);

        contrasenaField = new JPasswordField();
        contrasenaField.setBounds(80,130,80,25);
        add(contrasenaField);

        iniciarSesionBtn = new JButton("Iniciar sesion");
        iniciarSesionBtn.setBounds(20,170,120,30);
        iniciarSesionBtn.addActionListener(this);
        add(iniciarSesionBtn);

        registrarCuentaBtn = new JButton("Crear cuenta");
        registrarCuentaBtn.setBounds(180,170,120,30);
        registrarCuentaBtn.addActionListener(this);
        add(registrarCuentaBtn);

        cambiarContrasenaBtn = new JButton("Cambiar contraseña");
        cambiarContrasenaBtn.setBounds(20,210,120,30);
        cambiarContrasenaBtn.addActionListener(this);
        add(cambiarContrasenaBtn);

        usuariosRegistradosBtn = new JButton("Usuarios registrados");
        usuariosRegistradosBtn.setBounds(180,210,120,30);
        usuariosRegistradosBtn.addActionListener(this);
        add(usuariosRegistradosBtn);
    }

    public void limpiarCampos(){
        nombreField.setText("");
        emailField.setText("");
        contrasenaField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = nombreField.getText();
        String email = emailField.getText();
        String contrasena = contrasenaField.getText();

        if(iniciarSesionBtn.isSelected()){
            if(securityManager.autenticarUsuario(email,contrasena)){
                JOptionPane.showMessageDialog(this,"¡Bienvenido "+securityManager.obtenerNombreCompleto(email)+"!");
            }
        }
        if(registrarCuentaBtn.isSelected()){
            if(securityManager.registrarUsuario(nombre,email,contrasena)){
                JOptionPane.showMessageDialog(this,"Usuario registrado exitosamente");
            }
        }

        if(cambiarContrasenaBtn.isSelected()){
            new WinMenu().showWinCambioContrasena();
        }
        if(usuariosRegistradosBtn.isSelected()){
            JOptionPane.showMessageDialog(this,securityManager.obtenerUsuariosRegistrados());
        }

        limpiarCampos();
    }
}
