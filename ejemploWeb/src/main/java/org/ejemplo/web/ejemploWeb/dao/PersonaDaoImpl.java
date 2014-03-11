package org.ejemplo.web.ejemploWeb.dao;


import java.util.ArrayList;
import java.util.List;

import org.ejemplo.web.ejemploWeb.model.Persona;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDaoImpl implements PersonaDao {
	
	private List<Persona> lista = new ArrayList<Persona>();
	
	@Override
	public List<Persona> readAll() {
		return getLista();
	}
	
	@Override
	public void save(Persona persona) {
		lista.add(persona);
	}
	
	public List<Persona> getLista() {
		return lista;
	}
	
	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

}
