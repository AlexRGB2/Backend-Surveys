package com.edu.utng.surveys.models;

import javax.persistence.*;

@Entity
@Table(name="encuesta")
public class EncuestaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long numEncuesta;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String numPreguntas;

    @Column(nullable = false)
    private String cuatrimestre;

    @Column(nullable = false)
    private int profesorNumEmpleado;

    @Column(nullable = false)
    private int alumnoMatricula;

    public Long getNumEncuesta() {
        return numEncuesta;
    }

    public void setNumEncuesta(Long numEncuesta) {
        this.numEncuesta = numEncuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumPreguntas() {
        return numPreguntas;
    }

    public void setNumPreguntas(String numPreguntas) {
        this.numPreguntas = numPreguntas;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public int getProfesorNumEmpleado() {
        return profesorNumEmpleado;
    }

    public void setProfesorNumEmpleado(int profesorNumEmpleado) {
        this.profesorNumEmpleado = profesorNumEmpleado;
    }

    public int getAlumnoMatricula() {
        return alumnoMatricula;
    }

    public void setAlumnoMatricula(int alumnoMatricula) {
        this.alumnoMatricula = alumnoMatricula;
    }
}
