package com.prueba.anton.web;
import com.prueba.anton.service.SucursalService;
import com.prueba.anton.dominio.Sucursal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author dntn
 */
@Controller
public class RutasSucursal {
    
    @Autowired
    private SucursalService sucursalService;
    
    @GetMapping("/sucursales")
    public String inicio(Model model){
        List<Sucursal> sucursales = sucursalService.listarSucursales();
        model.addAttribute("sucursales",sucursales);
        return "Sucursales";
    }
    
    @GetMapping("/sucursal/{idSucursal}")
    public String editar(Sucursal sucursal, Model model){
        sucursal = sucursalService.encontrarSucursal(sucursal);
        System.out.println(sucursal);
        model.addAttribute("sucursal", sucursal);               
        return "modificarSucursal";
    }   
    
    @PostMapping("/sucursal/guardar")
    public String actualizar(Sucursal sucursal){
        sucursalService.guardar(sucursal);
        return "redirect:/sucursales";
    }
    
    @GetMapping("/sucursal/eliminar")
    public String eliminar(Sucursal sucursal){
        sucursalService.eliminar(sucursal);         
        return "redirect:/sucursales";
    }
}
