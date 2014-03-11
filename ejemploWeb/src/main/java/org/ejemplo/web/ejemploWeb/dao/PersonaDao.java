package org.ejemplo.web.ejemploWeb.dao;

import java.util.List;

import org.ejemplo.web.ejemploWeb.model.Persona;

public interface PersonaDao {
	
	void save (Persona persona);

	List<Persona> readAll();

}
