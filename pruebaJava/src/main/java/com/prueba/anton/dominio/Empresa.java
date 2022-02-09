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
@Table(name = "Empresa")
public class Empresa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresa;
    private String nombre;
    private String pais;    
    
}
