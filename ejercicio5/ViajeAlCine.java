package ejercicio5;

import java.util.ArrayList;

public class ViajeAlCine {
    private ArrayList<Integer> lineasQuePasanCerca;
    private boolean entradaComprada;
    private int cantidadDeMicros;
    private Persona persona;
    public ViajeAlCine(Persona persona){
        /*int[] lineas = {28, 36, 44, 5, 51, 60, 73, 89};
        lineasQuePasanCerca = new ArrayList<>();
        for (int linea: lineas){
            lineasQuePasanCerca.add(linea);
        }*/
        this.entradaComprada = false;
        this.persona = persona;
    }
    public void tengoEntradaParaPelicula(boolean entradaComprada){
        if(entradaComprada)this.entradaComprada = true;
    }
    public void cantidadDeMicrosAAbordar(int cantidadMicros){
        this.cantidadDeMicros = cantidadMicros;
    }
    private double calcularElPasajeNecesario(){
        return cantidadDeMicros* persona.pasajeIdaYVuelta();
    }
    public String decision(){
        if((calcularElPasajeNecesario() <= persona.getDineroDisponible()) && entradaComprada) {
            return "irá al cine";
        }
        else {
            return "no irá al cine";
        }
    }

    public static void main(String[] args) {
        Persona estudiante = new Estudiante(5.3);
        ViajeAlCine viajeAlCine = new ViajeAlCine(estudiante);
        viajeAlCine.tengoEntradaParaPelicula(true);
        viajeAlCine.calcularElPasajeNecesario();
        viajeAlCine.cantidadDeMicrosAAbordar(2);
        System.out.println(viajeAlCine.decision());
    }
}
