package com.edu.utng.surveys.models;

import java.util.List;
import javax.persistence.*;

public class EncuestaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int numEncuesta;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String numPreguntas;

    @Column(nullable = false)
    private String cuatrimestre;

    public int getNumEncuesta() {
        return numEncuesta;
    }

    public void setNumEncuesta(int numEncuesta) {
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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "alumno")
    private List<AlumnoModel> alumno;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "profesor")
    private List<ProfesorModel> reservations;
}
