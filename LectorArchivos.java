import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivos extends JFrame {
    private JButton btnLeer, btnMostrar;
    private JLabel lblInfo;
    private List<Alumno> alumnos = new ArrayList<>();

    public LectorArchivos() {
        setTitle("Lector de Archivos");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btnLeer = new JButton("Leer Archivo");
        btnMostrar = new JButton("Mostrar Detalles");
        lblInfo = new JLabel(" ");

        btnLeer.addActionListener(e -> leerArchivo());
        btnMostrar.addActionListener(e -> mostrarDetalles());

        add(btnLeer);
        add(btnMostrar);
        add(lblInfo);
    }

    private void leerArchivo() {
        /*JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(this);
*/
        //File archivo = new File("C:\\Users\\HP\\IdeaProjects\\Tareas\\src");
        //if (/*resultado == JFileChooser.APPROVE_OPTION*/archivo.exists()) {
            //File archivo = fileChooser.getSelectedFile();
            //alumnos.clear(); // Limpiar lista anterior

        File archivo = new File("C:\\Users\\HP\\IdeaProjects\\Tareas\\src\\al.txt.txt");
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    // Dividir línea por espacios o tabulaciones
                    String[] datos = linea.split("[\\s\\t]+");

                    if (datos.length >= 8) {
                        try {
                            int año = Integer.parseInt(datos[0]);
                            String genero = datos[1];
                            String nacionalidad = datos[2];
                            String pais = datos[3];
                            String estadoOrigen = datos[4];
                            String fecha = datos[5]; // Asegúrate de que este formato sea correcto
                            int edad = Integer.parseInt(datos[6]);
                            String categoria = datos[7];
                            // Crear objeto Alumno
                            alumnos.add(new Alumno(año, genero, nacionalidad, pais, estadoOrigen, fecha, edad, categoria));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(this, "Error de formato en la línea: " + linea);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            JOptionPane.showMessageDialog(this, "Datos faltantes en la línea: " + linea);
                        }
                    }
                }
                lblInfo.setText("Archivo leído correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
            }
        //}
    }

    private void mostrarDetalles() {
        String mensaje = "Total de objetos leídos: " + alumnos.size();
        lblInfo.setText(mensaje);

        // Mostrar detalles en consola (opcional)
        System.out.println("\n--- Detalles de Alumnos ---");
        for (Alumno p : alumnos) {
            System.out.println(p);
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LectorArchivos ventana = new LectorArchivos();
            ventana.setVisible(true);
        });
    }
}
