package org.ejemplo.web.ejemploWeb.controller;

import org.ejemplo.web.ejemploWeb.model.Persona;
import org.ejemplo.web.ejemploWeb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {
	
	@Autowired
	private PersonaService personaService; 
	
	@RequestMapping("/menu")
	public String menu(ModelMap model) {
		model.put("llave", "prueba de spring");
		
		return "menu";
	}
	
	@RequestMapping("/")
	public String root(){
		return "redirect:/menu";
	}
	
	@RequestMapping("/formPersona")
	public String formPersona(ModelMap model){
		model.put("persona", new Persona());
		return "personaForm";
	}
	
	@RequestMapping(value = "/altaPersona", method = RequestMethod.POST)
	public String altaPersona(@ModelAttribute Persona persona){
		personaService.save(persona);
		return "redirect:/listaPersonas";
	}
	
	@RequestMapping("/listaPersonas")
	public String listaPersonas(ModelMap model)  {
		model.put("listaPersonas", personaService.readAll());
		return "listaPersonas";
	}
	

}
