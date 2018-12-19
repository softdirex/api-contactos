package com.test.contactos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.contactos.dao.RepositorioContacto;
import com.test.contactos.entity.Contacto;

@Service
public class ContactoService {
	
	@Autowired
    RepositorioContacto dao;
	
	public Contacto save(Contacto contacto){
        return dao.saveAndFlush(contacto);
    }

}
