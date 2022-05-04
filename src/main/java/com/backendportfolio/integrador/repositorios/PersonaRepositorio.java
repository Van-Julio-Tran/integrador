package com.backendportfolio.integrador.repositorios;

import com.backendportfolio.integrador.modelos.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

}
