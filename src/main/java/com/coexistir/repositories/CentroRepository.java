package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Centro;

public interface CentroRepository extends JpaRepository<Centro, Integer> {
	
	Centro findByIdCentroLike(Integer idCentro);

}
