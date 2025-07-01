package colegio.persona.empleados;

import colegio.persona.Persona;

public class Profesor extends Persona implements Trabajador{
    private String materia;
    public Profesor(String nombre, int edad, String materia){
        super(nombre,edad);
        this.materia = materia;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre+ " está dando la materia de "+materia);
    }
}
