package com.edu.utng.surveys.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.utng.surveys.models.AlumnoModel;
import com.edu.utng.surveys.services.AlumnoService;

@RestController
@RequestMapping("alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping()
    public ArrayList<AlumnoModel> obtenerAlumno(){
        return alumnoService.obtenerAlumno();
    }

    @PostMapping
    public AlumnoModel guardarAlumno(@RequestBody AlumnoModel alumno){
        return this.alumnoService.guardarAlumno(alumno);
    }
}
