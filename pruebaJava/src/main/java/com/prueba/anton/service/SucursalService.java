package com.prueba.anton.service;

import com.prueba.anton.dominio.Sucursal;
import java.util.List;

/**
 *
 * @author dntn
 */
public interface SucursalService {
    
    public List<Sucursal> listarSucursales();
    
    public List<Sucursal> listarSucursalesEmpresa(Sucursal sucursal);
    
    public Sucursal encontrarSucursal(Sucursal sucursal);
    
    public void guardar(Sucursal sucursal);
    
    public void eliminar(Sucursal sucursal);
    
    public void actualizar(Sucursal sucursal);
    
}
