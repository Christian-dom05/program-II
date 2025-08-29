package practico.vista;

/**
 * En esta clase se sitúan todos los JComponents del programa (botón nuevo y botón ordenar)
 * Esta clase actúa de Observador de la clase Numeros, siguiendo el patrón de diseño
 * Observer. También actúa de Vista y Controlador simultáneamente, siguiendo el orden
 * MVC.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import practico.modelo.Numeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PanelNumeros extends JPanel implements PropertyChangeListener {
    /**
     * Se crean variables e instancias de clases
     */
    private JButton nuevo, ordenar;
    private Numeros numeros;
    private static final Logger logger = LogManager.getRootLogger();

    /**
     * Método constructor
     * @param numeros
     */
    public PanelNumeros(Numeros numeros){
        this.numeros = numeros;
        logger.info("Se añade como observador de "+numeros.toString()+" al panel "+this.toString());
        this.numeros.addObservador(this);
        setSize(500,500);
        setLayout(null);

        logger.info("Se crea botón para añadir número");
        nuevo = new JButton("Nuevo");
        nuevo.setBounds(20,250,110,40);
        nuevo.addActionListener(new ActionListener() {
            /**
             * Verifica primeramente si la cantidad de números ingresados no supera el límite
             * establecido.
             * Lanza error de formato de número y muestra con un showMessageDialog.
             * Si todo marcha bien, el número ingresado se guardará a través del método
             * añadirNumero()
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numeros.getCantidadActualDeNumeros() >= numeros.getCantidadMaxima()){
                    JOptionPane.showMessageDialog(getParent(), "Cantidad máxima ingresada");
                    numeros.borrarLista();
                    return;
                }
                try{
                    numeros.añadirNumero(Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese número")));
                }catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(getParent(),"ERROR: "+exception.getMessage());
                    logger.info("Se lanza error tipo NumberFormatException ");
                }
            }
        });
        add(nuevo);
        logger.info("Se añadió el botón -Nuevo- al panel "+this.toString());

        logger.info("Se crea botón para ordenar la lista de números dados");
        ordenar = new JButton("Ordenar");
        ordenar.setBounds(160,250,110,40);

        // Evento que llama al método ordenarNumeros() para ordenar en forma ascendente
        ordenar.addActionListener(e -> numeros.ordenarNumeros());
        add(ordenar);
        logger.info("Se añadió el botón -Ordenar- al panel "+this.toString());

    }

    /**
     * Se dibuja una serie de números dados por el objeto Numeros a través del métodp drawString
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString(numeros.getNumerosIngresados(),40,40);
        logger.info("Se pinta "+numeros.toString());
    }

    /**
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *          and the property that has changed.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        logger.info("Se repinta el JPanel por llamada al método propertyChange");
        repaint();
    }
}
