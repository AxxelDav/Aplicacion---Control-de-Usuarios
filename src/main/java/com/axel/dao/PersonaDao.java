package com.axel.dao;

import com.axel.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends JpaRepository<Persona, Long> {

}