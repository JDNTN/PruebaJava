package com.prueba.anton.service;

import com.prueba.anton.dao.SucursalDao;
import com.prueba.anton.dominio.Sucursal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dntn
 */
@Service
public class SucursalServiceImpl implements SucursalService{

    @Autowired
    private SucursalDao sucursalDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Sucursal> listarSucursales() {
        return (List<Sucursal>) sucursalDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Sucursal> listarSucursalesEmpresa(Sucursal sucursal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(readOnly = true)
    public Sucursal encontrarSucursal(Sucursal sucursal) {
        return sucursalDao.findById(sucursal.getIdSucursal()).orElse(null);
    }

    @Override
    @Transactional
    public void guardar(Sucursal sucursal) {    
        System.out.println("Que entra?");
        System.out.println(sucursal);
        System.out.println("Termina");
        sucursalDao.save(sucursal);       
    }

    @Override
    @Transactional
    public void eliminar(Sucursal sucursal) {
        sucursalDao.delete(sucursal);
    }

    @Override
    public void actualizar(Sucursal sucursal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
