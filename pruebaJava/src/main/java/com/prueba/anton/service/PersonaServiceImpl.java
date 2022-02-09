package com.prueba.anton.service;

import com.prueba.anton.dao.PersonaDao;
import com.prueba.anton.dominio.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dntn
 */
@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaDao personaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listaPersonasSucursal(Persona persona) {
        return null;
    }

    @Override
    @Transactional
    public void guardad(Persona persona) {
        System.out.println(personaDao.save(persona));
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    public void actualizar(Persona persona) {
       // personaDao.
    }
    
    @Override
    @Transactional(readOnly = true) 
    public Persona encontrarPersona(Persona persona){
        return personaDao.findById(persona.getCUI()).orElse(null);
    }
    
}
