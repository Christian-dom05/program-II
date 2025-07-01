package colegio.persona;

public class Persona {
    protected String nombre;
    protected int edad;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void presentarse(){
        System.out.println("Hola, mi nombre es "+nombre+" y tengo "+edad+" años.");
    }
}
