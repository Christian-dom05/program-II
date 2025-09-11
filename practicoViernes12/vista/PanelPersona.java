package practicoViernes12.vista;

import practicoViernes12.modelo.Persona;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PanelPersona extends JPanel {
    private JButton btnBuscarPorCi;
    private JTextArea txtMostrarInfo;
    private ArrayList<Persona> personas;
    public PanelPersona(){
        importarUsuarios();
        ordenarListaUsuarios();
        setLayout(new BorderLayout());

        txtMostrarInfo = new JTextArea();
        txtMostrarInfo.setFont(new Font("Arial", Font.BOLD,20));
        add(txtMostrarInfo, BorderLayout.CENTER);

        btnBuscarPorCi = new JButton("Buscar CI");
        add(btnBuscarPorCi, BorderLayout.SOUTH);

    }

    private void ordenarListaUsuarios() {

    }

    private void importarUsuarios() {
        String rutaArchivo = ""; // Debes tener cuidado, debes colocar una ruta de archivo
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Separar los valores por coma
                String[] valores = linea.split(",");

                // Imprimir los valores de la línea (esto se puede omitir)
                for (String valor : valores) {
                    System.out.print(valor + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
