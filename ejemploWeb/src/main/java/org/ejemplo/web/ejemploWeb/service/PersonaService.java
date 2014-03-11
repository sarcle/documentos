package org.ejemplo.web.ejemploWeb.service;

import java.util.List;

import org.ejemplo.web.ejemploWeb.model.Persona;

public interface PersonaService {
	
	void save(Persona persona);

	List<Persona> readAll();

}
