package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Leitura;

public interface LeituraRepository extends JpaRepository<Leitura, Integer> {
	
	Leitura findByIdLeituraLike(Integer idLeitura);

}
