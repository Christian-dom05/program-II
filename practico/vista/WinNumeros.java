package practico.vista;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import practico.modelo.Numeros;

import javax.swing.*;

/**
 * WinNumeros es la ventana sobre la cual corre el programa. Aquí se crea una instancia del objeto
 * Numeros y se pasa al constructor del JPanel PanelNumeros
 */
public class WinNumeros extends JFrame {
    private Numeros numeros;
    private static final Logger logger = LogManager.getRootLogger();

    public WinNumeros(){
        this.numeros = new Numeros();
        logger.info("Instancia creada de "+ numeros.toString());
        PanelNumeros panelNumeros = new PanelNumeros(numeros);
        logger.info("Instancia pasa al constructor de "+panelNumeros.toString());

        setTitle("numeros");
        setLayout(null);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panelNumeros);
        logger.info("Se termina de dar las características de la ventana "+this.toString());

        setVisible(true);
    }

    /**
     * Método main para correr el programa
     * @param args
     */
    public static void main(String[] args) {

        new WinNumeros();
    }
}
