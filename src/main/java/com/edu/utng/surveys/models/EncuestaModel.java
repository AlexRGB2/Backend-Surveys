package com.edu.utng.surveys.models;

import java.util.List;
import javax.persistence.*;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "alumnoMatricula", referencedColumnName = "matricula")
    private List<AlumnoModel> alumno;

    public List<AlumnoModel> getAlumno() {
        return alumno;
    }

    public void setAlumno(List<AlumnoModel> alumno) {
        this.alumno = alumno;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="profesorNumEmpleado", referencedColumnName = "numEmpleado")
    private List<ProfesorModel> profesor;

    public List<ProfesorModel> getProfesor() {
        return profesor;
    }

    public void setProfesor(List<ProfesorModel> profesor) {
        this.profesor = profesor;
    }
}
