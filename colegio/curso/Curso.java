package colegio.curso;

import colegio.persona.Persona;
import colegio.persona.empleados.Profesor;
import colegio.persona.estudiantes.Estudiante;

import java.util.List;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private List<Estudiante> estudiantes;
    public Curso(String nombre, Profesor profesor, List<Estudiante> estudiante){
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = estudiante;
    }
    public void mostrarCurso(){
        System.out.println(nombre);
        profesor.presentarse();
        System.out.println("-----------------------------");
        for (Estudiante e: estudiantes){
            e.presentarse();
        }
    }
}
