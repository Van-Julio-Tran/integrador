package com.backendportfolio.integrador.repositorios;

import com.backendportfolio.integrador.modelos.Educacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepositorio extends JpaRepository<Educacion, Long> {

}
