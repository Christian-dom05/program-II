package practico.modelo;

/**
 * Clase que actúa como observado según el patrón de diseño Observer. Es observado por
 * el JPanel PanelNumeros. Además de ser un modelo, siguiendo la estructura MVC.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Numeros {
    private StringBuilder listaNumeros = new StringBuilder();
    private ArrayList<Integer> numeros;
    private PropertyChangeSupport observado;
    private static final Logger logger = LogManager.getRootLogger();
    private final int CANTIDAD_MAXIMA = 20;

    /**
     * Constructor que sólo inicializa
     */
    public Numeros(){
        numeros = new ArrayList<>();
        observado = new PropertyChangeSupport(this);
        logger.info("se implementó el aviso de cambios para el objeto "+ numeros.toString());
    }

    /**
     * Añade un observador para la clase Numeros
     * @param observador
     */
    public void addObservador(PropertyChangeListener observador){
        logger.info("Se registró nuevo observador para la clase "+numeros.toString());
        observado.addPropertyChangeListener(observador);
    }

    /**
     * Método para añadir el número ingresado por el usuario dentro del ArrayList numeros.
     * También da aviso al observador PanelNumeros
     * @param numero
     */
    public void añadirNumero(int numero){
        numeros.add(numero);
        logger.info("Se añadió el número "+numero);
        borrarLista();
        logger.info("Se limpió el StringBuilder -listaNumeros-");
        observado.firePropertyChange("ORDENAR", true,false);
    }

    /**
     * Usa el método de ordenamiento burbujas para ordenar la lista de números de menor
     * a mayor.
     * Avisa al observador PanelNumeros de los cambios.
     */
    public void ordenarNumeros(){
        for (int i = 0; i < numeros.size() - 1; i++) {
            for (int j = 0; j < numeros.size() - i - 1; j++) {
                if (numeros.get(j) > numeros.get(j + 1)) {

                    int aux = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, aux);
                    logger.info("Se intercambió "+j+" por "+j+1);
                }
            }
        }
        borrarLista();
        observado.firePropertyChange("ORDENAR", true,false);
    }

    /**
     * Método para borrar lista, esto evita que se escriba información repetida
     */
    public void borrarLista(){
        listaNumeros.setLength(0);
    }

    /**
     * Devuelve la cantidad de números ingresados
     * @return
     */
    public int getCantidadActualDeNumeros(){
        return numeros.size();
    }

    /**
     * Devuelve todos los números ingresados
     * @return
     */
    public String getNumerosIngresados(){
        for(int n: numeros){
            listaNumeros.append(n + " - ");
        }
        return listaNumeros.toString();
    }

    /**
     * Devuelve la cantidad máxima de elementos permitidos
     * @return
     */
    public int getCantidadMaxima() {
        return CANTIDAD_MAXIMA;
    }


}
