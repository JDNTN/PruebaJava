package com.prueba.anton.web;


import com.prueba.anton.file.ProcesamientoArchivo;
import java.io.File;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author dntn
 */
@Controller
public class ControladorMenu {

    @GetMapping("/")
    public String inicio(Model model) {
        return "index";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes attributes) throws IOException {
        if (file == null || file.isEmpty()) {
            attributes.addFlashAttribute("message", "Por favor seleccione un archivo");
            return "redirect:/";
        }
      
        ProcesamientoArchivo procesamiento = new ProcesamientoArchivo();
        procesamiento.archivo(file);
        
        attributes.addFlashAttribute("message", "archivo cargado");
        return "redirect:/empresas";
    }
       

    @GetMapping("/error")
    public String error() {
        System.out.println("PTM");
        return "index";
    }

}
