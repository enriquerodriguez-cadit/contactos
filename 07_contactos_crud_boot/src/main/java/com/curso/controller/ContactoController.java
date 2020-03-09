package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Contacto;
import com.curso.service.ContactoService;

@RestController
public class ContactoController {
	
	@Autowired
	ContactoService contactoService;		

	@GetMapping(value="/contactos/{email}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Contacto recuperarContacto(@PathVariable("email") String email) {		
		return contactoService.obtenerContactos(email);				
	}		
	
	@GetMapping(value="/contactos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Contacto> recuperarTodos() {		
		return contactoService.obtenerContactos();				
	}		
		
	@PostMapping(value="/contactos", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void altaContacto(@RequestBody Contacto contacto) {		
		contactoService.altaContacto(contacto);			
	}
	
	@DeleteMapping(value="/contactos/{idContacto}")
	public void eliminarContacto(@PathVariable("idContacto") int idContacto) {
		contactoService.eliminarContacto(idContacto);			
	}	

	@PutMapping(value="/contactos", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarContacto(@RequestBody Contacto contacto) {
		contactoService.actualizarContacto(contacto);
	}
}
