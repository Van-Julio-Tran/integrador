package com.backendportfolio.integrador.repositorios;

import com.backendportfolio.integrador.modelos.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
