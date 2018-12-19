package com.test.contactos.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contacto implements Serializable{
	private static final long serialVersionUID = 4894729030347835498L;
	
	@Id
    @GeneratedValue
	Long id;
	String name;
	String phone;
	String email;
	
	public Contacto(Long id, String name, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	
	
	public Contacto() {
		super();
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
