package com.prueba.anton.dominio;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author dntn
 */
@Data
@Entity
@Table(name = "Sucursal")
public class Sucursal implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSucursal;
    private String nombre;
    private String direccion;
    private String telefono; 
    private int idEmpresa;    

    public Sucursal(String nombre, String direccion, String telefono, int idEmpresa) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.idEmpresa = idEmpresa;
    }

    public Sucursal() {
    }
    
    
    
}
