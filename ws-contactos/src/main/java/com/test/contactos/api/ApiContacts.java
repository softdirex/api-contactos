package com.test.contactos.api;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.contactos.dao.RepositorioContacto;
import com.test.contactos.entity.Contacto;
import com.test.contactos.service.ContactoService;

@RestController
public class ApiContacts {
	@Autowired
	ContactoService contactoService;
	
	@Autowired
	RepositorioContacto dao;
	
	@RequestMapping(value="/contactos", method=RequestMethod.GET)
	public List<Contacto> getContactos(){
		return dao.findAll();
    }
	
	@RequestMapping(value="/contactos/{id}", method=RequestMethod.GET)
	public List<Contacto> findById(@PathVariable @NotNull @DecimalMin("0") Set<Long> id){
		return dao.findAllById(id);
    }
	
	@Autowired
	Mapper mapper;
	
	
	@RequestMapping(value="/contacto", method=RequestMethod.POST)
	public ContactoResponse updateOrSave(@RequestBody @Valid ContactoRequest contactoRequest)
	{
		// Mapeo request dto ==&amp;amp;amp;amp;amp;gt; entity
		Contacto contacto = mapper.map(contactoRequest, Contacto.class);
		
		// Invoca lógica de negocio
	    Contacto updatedContacto = contactoService.save(contacto);
	     
	    // Mapeo entity ==&amp;amp;amp;amp;amp;gt; response entity
	    ContactoResponse contactoResponse = mapper.map(updatedContacto, ContactoResponse.class); 
	     
	    return contactoResponse;
	}
}
