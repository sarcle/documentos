package org.ejemplo.web.ejemploWeb.model;

public class Persona {

	private String nombre;
	private String apodo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apodo=" + apodo + "]";
	}
	
	

}
