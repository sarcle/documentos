package org.ejemplo.web.ejemploWeb.service;

import java.util.List;

import org.ejemplo.web.ejemploWeb.dao.PersonaDao;
import org.ejemplo.web.ejemploWeb.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private PersonaDao personaDao;

	@Override
	public void save(Persona persona) {
		personaDao.save(persona);
	}
	
	@Override
	public List<Persona> readAll() {
		
		return personaDao.readAll();
	}

}
