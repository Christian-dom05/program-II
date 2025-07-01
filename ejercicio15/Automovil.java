package ejercicio15;

public class Automovil{
    String marca, modelo;
    public Automovil(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Marca: "+marca + "\n"+
                "Modelo: "+modelo;
    }
}
