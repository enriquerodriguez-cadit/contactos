package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Contacto;

public interface ContactoDao extends JpaRepository<Contacto, Integer>{

	Contacto findByEmail(String email);
		
	/****
	@Transactional
	@Modifying
	@Query("update Contacto c set c.nombre=?1, c.email=?2, c.edad=?3 where c.idContacto=?4")
	void actualizarContacto(Contacto contacto);
	*/
}
