package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class PanelListaEstudiantes extends JPanel {

    private JTable tablaEstudiantes;
    private DefaultTableModel tableModel;
    protected JButton atrasBtn;

    public PanelListaEstudiantes(ActionListener listener) {
        setLayout(new BorderLayout());

        String[] columnas = {"Nombre", "Edad", "Carrera"};
        tableModel = new DefaultTableModel(columnas, 0);
        tablaEstudiantes = new JTable(tableModel);
        tablaEstudiantes.setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(tablaEstudiantes);
        add(scrollPane, BorderLayout.CENTER);

        atrasBtn = new JButton("Atrás");
        atrasBtn.addActionListener(listener);

        JPanel panelBoton = new JPanel();
        panelBoton.add(atrasBtn);
        add(panelBoton, BorderLayout.SOUTH);
    }

    public void actualizarTabla(List<Estudiante> estudiantes) {
        tableModel.setRowCount(0);
        for (Estudiante estudiante : estudiantes) {
            Object[] fila = {estudiante.getNombre(), estudiante.getEdad(), estudiante.getCarrera()};
            tableModel.addRow(fila);
        }
    }
}