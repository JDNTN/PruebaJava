package com.prueba.anton.web;

import com.prueba.anton.service.PersonaService;
import com.prueba.anton.dominio.Persona;
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
public class RutasPersona {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public String inicio(Model model) {
        List<Persona> personas = personaService.listarPersonas();

        model.addAttribute("personas", personas);
        return "personas";
    }

    @GetMapping("/personas/{CUI}")
    public String editar(Persona persona, Model model) {
        persona = personaService.encontrarPersona(persona);
        System.out.println(persona);
        model.addAttribute("persona", persona);
        return "modificarPersona";
    }

    @PostMapping("/personas/guardar")
    public String actualizar(Persona persona) {
        personaService.guardad(persona);
        return "redirect:/personas";
    }

    @GetMapping("/personas/eliminar")
    public String eliminar(Persona persona) {
        personaService.eliminar(persona);

        return "redirect:/personas";
    }
}
