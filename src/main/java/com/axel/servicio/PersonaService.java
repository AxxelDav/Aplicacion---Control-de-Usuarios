package com.axel.servicio;

import com.axel.domain.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> listarPersonas();

    void guardar(Persona persona);

    void eliminar(Persona persona);

    Persona encontrarPersona(Persona persona);
}
