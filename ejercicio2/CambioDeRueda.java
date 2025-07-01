package ejercicio2;

public class CambioDeRueda {
    private Automovil automovil;
    private String ruedaACambiar;

    public void AutoACambiarRueda(Automovil automovil){
        this.automovil = automovil;
    }
    public void quitarRueda(String ruedaAutomovil){
        this.ruedaACambiar = ruedaAutomovil;
        automovil.quitarRuedas(ruedaAutomovil);
    }
    public void cambiarRueda(Rueda nuevaRueda){
        automovil.colocarRuedas(nuevaRueda);
    }
}
