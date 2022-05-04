package com.backendportfolio.integrador.repositorios;

import com.backendportfolio.integrador.modelos.ExperienciaLaboral;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepositorio extends JpaRepository<ExperienciaLaboral, Long> {

}
