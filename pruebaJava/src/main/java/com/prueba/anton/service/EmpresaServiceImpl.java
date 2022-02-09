package com.prueba.anton.service;

import com.prueba.anton.dao.EmpresaDao;
import com.prueba.anton.dominio.Empresa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dntn
 */
@Service
public class EmpresaServiceImpl implements EmpresaService{

    @Autowired
    private EmpresaDao empresaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Empresa> listarEmpresas() {
        return (List<Empresa>) empresaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Empresa encontrarEmpresa(Empresa empresa) {
        return empresaDao.findById(empresa.getIdEmpresa()).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(Empresa empresa) {
        empresaDao.save(empresa);
    }

    @Override
    @Transactional
    public void eliminar(Empresa empresa) {
        empresaDao.delete(empresa);        
    }
   
}
