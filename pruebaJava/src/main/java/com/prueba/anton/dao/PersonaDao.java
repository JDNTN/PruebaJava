package com.prueba.anton.dao;

import org.springframework.data.repository.CrudRepository;
import com.prueba.anton.dominio.*;

/**
 *
 * @author dntn
 */
public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
