package com.backendportfolio.integrador.servicios;

import java.util.List;

import com.backendportfolio.integrador.modelos.Educacion;
import com.backendportfolio.integrador.modelos.ExperienciaLaboral;
import com.backendportfolio.integrador.modelos.Persona;
import com.backendportfolio.integrador.modelos.Usuario;
import com.backendportfolio.integrador.repositorios.EducacionRepositorio;
import com.backendportfolio.integrador.repositorios.ExperienciaRepositorio;
import com.backendportfolio.integrador.repositorios.PersonaRepositorio;
import com.backendportfolio.integrador.repositorios.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicios {

    @Autowired
    EducacionRepositorio eduRepo;
    @Autowired
    ExperienciaRepositorio expRepo;
    @Autowired
    PersonaRepositorio perRepo;
    @Autowired
    UsuarioRepositorio usuRepo;

    public List<Educacion> listadoEducacion() {
        return eduRepo.findAll();
    }

    public Educacion buscarEducacionId(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    public void crearEducacion(Educacion educacion) {
        eduRepo.save(educacion);
    }

    public boolean existeEducacionId(Long id) {
        return eduRepo.existsById(id);
    }

    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    public List<ExperienciaLaboral> listadoExperienciaLaboral() {
        return expRepo.findAll();
    }

    public ExperienciaLaboral buscarExperienciaLaboralId(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    public void crearExperienciaLaboral(ExperienciaLaboral experiencialaboral) {
        expRepo.save(experiencialaboral);
    }

    public boolean existeExperienciaLaboralId(Long id) {
        return expRepo.existsById(id);
    }

    public void borrarExperienciaLaboral(Long id) {
        expRepo.deleteById(id);
    }

    public List<Persona> listadoPersona() {
        return perRepo.findAll();
    }

    public Persona buscarPersonaId(Long id) {
        return perRepo.findById(id).orElse(null);
    }

    public void crearPersona(Persona persona) {
        perRepo.save(persona);
    }

    public boolean existePersonaId(Long id) {
        return perRepo.existsById(id);
    }

    public void borrarPersona(Long id) {
        perRepo.deleteById(id);

    }

    public List<Usuario> listadoUsuario() {
        return usuRepo.findAll();
    }

    public Usuario buscarUsuarioId(Long id) {
        return usuRepo.findById(id).orElse(null);
    }

    public void crearUsuario(Usuario usuario) {

        usuRepo.save(usuario);
    }

    public boolean existeUsuarioId(Long id) {
        return usuRepo.existsById(id);
    }

    public void borrarUsuario(Long id) {
        usuRepo.deleteById(id);
    }

}
