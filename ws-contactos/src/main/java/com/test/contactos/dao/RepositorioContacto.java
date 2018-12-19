package com.test.contactos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.contactos.entity.Contacto;

public interface RepositorioContacto extends JpaRepository<Contacto, Long>{

}
