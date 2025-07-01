package colegio;

import colegio.curso.Curso;
import colegio.persona.Persona;
import colegio.persona.empleados.Profesor;
import colegio.persona.estudiantes.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Marco",34,"Matemáticas");

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        Estudiante est1 = new Estudiante("luis",14,"5to B");
        Estudiante est2 = new Estudiante("Christian",15,"5to B");
        Estudiante est3 = new Estudiante("Alberto",15,"5to B");

        estudiantes.add(est1);
        estudiantes.add(est2);
        estudiantes.add(est3);

        Curso curso = new Curso("5to B",profesor,estudiantes);
        curso.mostrarCurso();

        profesor.trabajar();
    }
}
