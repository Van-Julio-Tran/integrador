package com.backendportfolio.integrador.controlador;

import java.util.List;
import com.backendportfolio.integrador.modelos.Persona;
import com.backendportfolio.integrador.servicios.Servicios;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class Controlador {

    @Autowired
    private Servicios servPersona;

    @PostMapping("/nueva/persona")
    public void agregarPersona(@RequestBody Persona per) {
        servPersona.crearPersona(per);
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return servPersona.listadoPersona();
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarPersona(@PathVariable Long id) {
        servPersona.borrarPersona(id);
    }

}
