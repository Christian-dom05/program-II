package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaEstudiante extends JFrame implements ActionListener {

    private ArrayList<Estudiante> estudiantes;

    private JPanel panelIngreso;
    private JTextField nombreField, edadField, carreraField;
    private JButton guardarBtn, borrarBtn, listaBtn;

    private PanelListaEstudiantes panelLista;

    private JPanel panelContenedor;
    private CardLayout cardLayout;

    public VentanaEstudiante() {
        setTitle("Ingreso de Estudiante");
        setSize(500, 350);
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

        guardarBtn = new JButton("Guardar");
        guardarBtn.setBounds(70, 160, 100, 30);
        guardarBtn.addActionListener(this);
        panelIngreso.add(guardarBtn);

        borrarBtn = new JButton("Borrar");
        borrarBtn.setBounds(200, 160, 100, 30);
        borrarBtn.addActionListener(this);
        panelIngreso.add(borrarBtn);

        listaBtn = new JButton("Lista");
        listaBtn.setBounds(330, 160, 100, 30);
        listaBtn.addActionListener(this);
        panelIngreso.add(listaBtn);
    }

    private void limpiarCampos() {
        nombreField.setText("");
        edadField.setText("");
        carreraField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == guardarBtn) {
            String nombre = nombreField.getText().trim();
            String edadText = edadField.getText().trim();
            String carrera = carreraField.getText().trim();

            if (nombre.isEmpty() || edadText.isEmpty() || carrera.isEmpty()) {
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

            Estudiante estudiante = new Estudiante(nombre, edad, carrera);
            estudiantes.add(estudiante);
            JOptionPane.showMessageDialog(this, "Estudiante guardado:\n" + estudiante);

            limpiarCampos();

        } else if (source == borrarBtn) {
            limpiarCampos();

        } else if (source == listaBtn) {
            panelLista.actualizarTabla(estudiantes);
            cardLayout.show(panelContenedor, "Lista");

        } else if (source == panelLista.atrasBtn) {
            cardLayout.show(panelContenedor, "Ingreso");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( VentanaEstudiante:: new);
    }
}
