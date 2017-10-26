package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Avaliacao;

public interface AdminRepository extends JpaRepository<Avaliacao, Integer> {
	
	public Avaliacao findByIdAvaliacaoLike(Integer idAvaliacao);

}
