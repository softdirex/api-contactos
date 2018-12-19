package com.test.contactos.api;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ContactoRequest {
	private Long id;
	
	@NotNull(message="El nombre es requerido")
	@Size(min=2, max=45, message="El nombre debe tener entre {min} y {max} caracteres")
	private String name;
	
	@Pattern(regexp="^\\+[0-9]*$", message="El número de telefono sólo puede tener dígitos iniciando con el símbolo +")
	private String phone;
	private String email;
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
}
