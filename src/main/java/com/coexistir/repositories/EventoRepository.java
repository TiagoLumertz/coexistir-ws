package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Evento;

<<<<<<< HEAD
public interface EventoRepository extends JpaRepository<Evento, Integer> {
=======
public interface AdminRepository extends JpaRepository<Evento, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
	
	public Evento findByIdEventoLike(Integer idEvento);

}
