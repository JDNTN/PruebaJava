package com.prueba.anton.service;

import com.prueba.anton.dominio.Persona;
import java.util.List;

/**
 *
 * @author dntn
 */
public interface PersonaService {
    
    
    public List<Persona> listarPersonas();
    
    public List<Persona> listaPersonasSucursal(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
    
    public void guardad(Persona persona);
    
    public void eliminar(Persona persona);
    
    public void actualizar(Persona persona);      
    
}
