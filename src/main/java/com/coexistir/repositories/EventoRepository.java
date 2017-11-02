package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
	
	Evento findByIdEventoLike(Integer idEvento);

}
