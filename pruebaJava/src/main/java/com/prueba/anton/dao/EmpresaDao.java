/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.anton.dao;

import com.prueba.anton.dominio.Empresa;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dntn
 */
public interface EmpresaDao extends CrudRepository<Empresa, Integer>{   
    
}
