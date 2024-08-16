package cl.praxis.mi_primer_spring.controller;

import cl.praxis.mi_primer_spring.model.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    private static final Logger logger = LoggerFactory.getLogger(PersonaController.class);

    @GetMapping
    public Persona getPersona() {
        Persona persona = new Persona("Ion", "Cucer", 43);
        logger.info(persona.toString()); // Imprime los datos en la consola
        return persona;
    }
}