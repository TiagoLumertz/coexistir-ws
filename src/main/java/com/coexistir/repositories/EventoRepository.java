package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Evento;

public interface AdminRepository extends JpaRepository<Evento, Integer> {
	
	public Evento findByIdEventoLike(Integer idEvento);

}
