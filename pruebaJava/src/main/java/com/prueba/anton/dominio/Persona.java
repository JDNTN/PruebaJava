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
@Table(name = "Persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private long CUI;
    private String nombre;    
    private int idSucursal;
    
}
