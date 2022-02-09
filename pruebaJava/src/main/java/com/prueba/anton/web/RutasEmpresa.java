package com.prueba.anton.web;

import com.prueba.anton.service.EmpresaService;
import com.prueba.anton.dominio.Empresa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author dntn
 */
@Controller
public class RutasEmpresa {
       
    @Autowired
    private EmpresaService empresaService;
    
    @GetMapping("/empresas")
    public String inicio(Model model){
        List<Empresa> empresas = empresaService.listarEmpresas();
        model.addAttribute("empresas",empresas);        
        return "Empresas";
    }
}
