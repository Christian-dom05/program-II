package practico3.obj;

import practico3.obj.Imagen;

public class Achicar implements IOperacionImagen{
    private Imagen target;
    private int porcentaje;
    private PropertyChangeSupport observado;
    public Achicar(Imagen target, int porcentaje){
        this.target = target;
        this.porcentaje = porcentaje;
        this.observado = new PropertyChangeSupport(this);
    }
    public void nuevoObservador(PropertyChangeListener observador) {
        this.observado.addPropertyChangeListener(observador);
        logger.info("Objeto cuenta con un nuevo observador: " +
                observador.toString());
    }
    public void ejecutar() {
        int wf = (target.getAncho() * this.porcentaje) / 100;
        int hf = (target.getAlto() * this.porcentaje) / 100;

        target.setTamanoPixeles(wf, hf);

        Imagen resultado = new Imagen(wf, hf);
        for (int i = 0; i < wf; i++) {
            for (int j = 0; j < hf; j++) {
                int xImagenOriginal = i * 100 / porcentaje;
                int yImagenOriginal = j * 100 / porcentaje;

                resultado.setPixel(i, j, target.get(xImagenOriginal, yImagenOriginal));
            }
        }

        target.setPixeles(wf, hf, resultado.getPixeles());
        observado.firePropertyChange("ACHICAR", true, true);
    }
}

