package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaEstudiante extends JFrame implements ActionListener {

    private ArrayList<Estudiante> estudiantes;

    private JPanel panelIngreso;
    private JTextField nombreField, edadField, carreraField, colegioField;
    private JButton guardarBtn, borrarBtn, listaBtn;
    private JRadioButton masculinoRadio, femeninoRadio;
    private ButtonGroup generoGroup;
    private JCheckBox captchaCheck;
    private JProgressBar captchaProgress;
    private Timer timer;
    private int value;
    private boolean captchaVerificado = false;
    private boolean verificandoCaptcha = false;
    private String genero;

    private PanelListaEstudiantes panelLista;

    protected JPanel panelContenedor;
    protected CardLayout cardLayout;

    public VentanaEstudiante() {
        setTitle("Ingreso de Estudiante");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        estudiantes = new ArrayList<>();

        cardLayout = new CardLayout();
        panelContenedor = new JPanel(cardLayout);

        crearPanelIngreso();

        panelLista = new PanelListaEstudiantes(this);

        panelContenedor.add(panelIngreso, "Ingreso");
        panelContenedor.add(panelLista, "Lista");

        add(panelContenedor);

        cardLayout.show(panelContenedor, "Ingreso");

        setVisible(true);
    }

    private void crearPanelIngreso() {
        panelIngreso = new JPanel();
        panelIngreso.setLayout(null);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(30, 30, 80, 25);
        panelIngreso.add(nombreLabel);

        nombreField = new JTextField();
        nombreField.setBounds(120, 30, 300, 25);
        panelIngreso.add(nombreField);

        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setBounds(30, 70, 80, 25);
        panelIngreso.add(edadLabel);

        edadField = new JTextField();
        edadField.setBounds(120, 70, 300, 25);
        panelIngreso.add(edadField);

        JLabel carreraLabel = new JLabel("Carrera:");
        carreraLabel.setBounds(30, 110, 80, 25);
        panelIngreso.add(carreraLabel);

        carreraField = new JTextField();
        carreraField.setBounds(120, 110, 300, 25);
        panelIngreso.add(carreraField);

        JLabel colegioLabel = new JLabel("Colegio:");
        colegioLabel.setBounds(30,150,80,25);
        panelIngreso.add(colegioLabel);

        colegioField = new JTextField();
        colegioField.setBounds(120,150,300,25);
        panelIngreso.add(colegioField);

        femeninoRadio = new JRadioButton("Femenino");
        femeninoRadio.setBounds(80,190,100,25);
        femeninoRadio.addActionListener(this);
        panelIngreso.add(femeninoRadio);

        masculinoRadio = new JRadioButton("Masculino");
        masculinoRadio.setBounds(220,190,100,25);
        masculinoRadio.addActionListener(this);
        panelIngreso.add(masculinoRadio);

        generoGroup = new ButtonGroup();
        generoGroup.add(femeninoRadio);
        generoGroup.add(masculinoRadio);

        captchaCheck = new JCheckBox("No soy un robot");
        captchaCheck.setBounds(30,240,120,25);
        captchaCheck.addActionListener(this);
        panelIngreso.add(captchaCheck);

        captchaProgress = new JProgressBar(0,100);
        captchaProgress.setBounds(160,240,100,25);
        captchaProgress.setValue(0);
        captchaProgress.setStringPainted(true);
        panelIngreso.add(captchaProgress);

        guardarBtn = new JButton("Guardar");
        guardarBtn.setBounds(70, 290, 100, 30);
        guardarBtn.addActionListener(this);
        panelIngreso.add(guardarBtn);

        borrarBtn = new JButton("Borrar");
        borrarBtn.setBounds(200, 290, 100, 30);
        borrarBtn.addActionListener(this);
        panelIngreso.add(borrarBtn);

        listaBtn = new JButton("Lista");
        listaBtn.setBounds(330, 290, 100, 30);
        listaBtn.addActionListener(this);
        panelIngreso.add(listaBtn);
    }

    private void limpiarCampos() {
        nombreField.setText("");
        edadField.setText("");
        carreraField.setText("");
        colegioField.setText("");
        femeninoRadio.setSelected(false);
        masculinoRadio.setSelected(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(captchaCheck.isSelected() && !verificandoCaptcha){
            verificandoCaptcha = true;
            timer = new Timer(100, new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(value<100){
                        value++;
                        captchaProgress.setValue(value);
                    }else {
                        timer.stop();
                        captchaVerificado = true;
                    }
                }
            });
            timer.start();
            JOptionPane.showMessageDialog(this,"comprobando que no es un robot","CaptCha",JOptionPane.INFORMATION_MESSAGE);
        }
        if (femeninoRadio.isSelected()){
            genero = "Femenino";
        } else if (masculinoRadio.isSelected()) {
            genero = "Masculino";
        }
        if (source == guardarBtn && captchaVerificado) {
            String nombre = nombreField.getText().trim();
            String edadText = edadField.getText().trim();
            String carrera = carreraField.getText().trim();
            String colegio = colegioField.getText().trim();

            if (nombre.isEmpty() || edadText.isEmpty() || carrera.isEmpty() || colegio.isEmpty() || genero.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int edad;
            try {
                edad = Integer.parseInt(edadText);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Edad debe ser un número .", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Estudiante estudiante = new Estudiante(nombre, edad, carrera, colegio, genero);
            estudiantes.add(estudiante);
            JOptionPane.showMessageDialog(this, "Estudiante guardado:\n" + estudiante);

            limpiarCampos();

        } else if (source == borrarBtn) {
            limpiarCampos();

        } else if (source == listaBtn) {
            panelLista.actualizarTabla(estudiantes);
            cardLayout.show(panelContenedor, "Lista");

        } /*else if (source == panelLista.atrasBtn) {
            cardLayout.show(panelContenedor, "Ingreso");
        }*/

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( VentanaEstudiante:: new);
    }
}