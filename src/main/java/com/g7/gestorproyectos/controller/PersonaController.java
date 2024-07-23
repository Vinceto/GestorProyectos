package com.g7.gestorproyectos.controller;
import com.g7.gestorproyectos.model.Persona;
import com.g7.gestorproyectos.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/datos")
    public Persona obtenerDatosPersona() {
        Persona persona = personaService.obtenerPersona();
        System.out.println(persona);
        return persona;
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola, bienvenido a mi primer aplicativo Spring Boot!";
    }
}