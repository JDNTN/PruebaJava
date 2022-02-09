package com.prueba.anton.service;

import com.prueba.anton.dominio.Empresa;
import java.util.List;

/**
 *
 * @author dntn
 */
public interface EmpresaService {
    
    public List<Empresa> listarEmpresas();
    
    public Empresa encontrarEmpresa(Empresa empresa);
    
    public void guardar(Empresa empresa);
    
    public void eliminar(Empresa empresa);   
    
}
