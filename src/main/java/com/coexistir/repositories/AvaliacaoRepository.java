package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Avaliacao;

<<<<<<< HEAD
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer> {
=======
public interface AdminRepository extends JpaRepository<Avaliacao, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
	
	public Avaliacao findByIdAvaliacaoLike(Integer idAvaliacao);

}
