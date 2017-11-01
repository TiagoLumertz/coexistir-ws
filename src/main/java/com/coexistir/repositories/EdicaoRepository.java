package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Edicao;

public interface EdicaoRepository extends JpaRepository<Edicao, Integer> {
	
	Edicao findByIdEdicaoLike(Integer idEdicao);

}
