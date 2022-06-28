package com.edu.utng.surveys.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.utng.surveys.models.AlumnoModel;

@Repository
public interface AlumnoRepository extends CrudRepository<AlumnoModel, Long>{
    
}
