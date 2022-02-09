package com.prueba.anton.dao;

import com.prueba.anton.dominio.Sucursal;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dntn
 */
public interface SucursalDao extends CrudRepository<Sucursal, Integer>{
    
}
