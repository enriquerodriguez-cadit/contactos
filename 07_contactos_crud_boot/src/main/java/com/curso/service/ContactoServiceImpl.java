package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ContactoDao;
import com.curso.model.Contacto;

@Service
public class ContactoServiceImpl implements ContactoService {

	@Autowired
	ContactoDao contactoDao;	
	
	@Override
	public void altaContacto(Contacto contacto) {					
		contactoDao.save(contacto);		
	}

	@Override
	public List<Contacto> obtenerContactos() {		
		return contactoDao.findAll();
	}
	
	@Override
	public Contacto obtenerContactos(String email) {
		// TODO Auto-generated method stub
		return contactoDao.findByEmail(email);
	}	

	@Override
	public void eliminarContacto(int idContacto) {
		contactoDao.deleteById(idContacto);
	}

	@Override
	public void actualizarContacto(Contacto contacto) {
		contactoDao.save(contacto);
	}


}
