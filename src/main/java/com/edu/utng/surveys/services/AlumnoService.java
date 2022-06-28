package com.edu.utng.surveys.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utng.surveys.models.AlumnoModel;
import com.edu.utng.surveys.repositories.AlumnoRepository;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public ArrayList<AlumnoModel> obtenerAlumno(){
        return (ArrayList<AlumnoModel>)alumnoRepository.findAll();
    }

    public AlumnoModel guardarAlumno (AlumnoModel alumno){
        return alumnoRepository.save(alumno);
    }
}
