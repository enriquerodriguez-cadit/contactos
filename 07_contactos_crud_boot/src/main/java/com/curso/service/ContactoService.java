
package com.curso.service;

import java.util.List;

import com.curso.model.Contacto;

public interface ContactoService {
	//A�ade el contacto si no existe el email
	void altaContacto(Contacto contacto);
	List<Contacto> obtenerContactos();
	Contacto obtenerContactos(String email); 
	void eliminarContacto(int idContacto);
	void actualizarContacto(Contacto contacto);
	Contacto recuperarPorId(int idContacto);
	
}
