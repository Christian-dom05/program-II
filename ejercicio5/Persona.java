package ejercicio5;

public class Persona {
    private double pasaje;
    private double dineroDisponible;
    public Persona(double pasaje, double dineroDisponible){
        this.pasaje = pasaje;
        this.dineroDisponible = dineroDisponible;
    }

    public double pasajeIdaYVuelta(){
        return pasaje*2;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }
}
