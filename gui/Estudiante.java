package gui;

import gui.VentanaEstudiante;
public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private String colegio;
    private String genero;

    public Estudiante(String nombre, int edad, String carrera, String colegio, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.colegio = colegio;
        this.genero = genero;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCarrera() { return carrera; }
    public String getColegio() { return colegio; }
    public String getGenero() { return genero; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nCarrera: " + carrera + "\nColegio: " + colegio + "\nGenero: " + genero;
    }
}