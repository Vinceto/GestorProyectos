package com.g7.gestorproyectos.service;
import com.g7.gestorproyectos.model.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    public Persona obtenerPersona() {
        return new Persona(36, "Munoz", "Bernabe");
    }
}
