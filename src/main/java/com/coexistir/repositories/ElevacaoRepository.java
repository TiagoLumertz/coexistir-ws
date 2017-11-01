package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Elevacao;

public interface ElevacaoRepository extends JpaRepository<Elevacao, Integer> {
	
	Elevacao findByIdElevacaoLike(Integer idElevacao);
	
}
