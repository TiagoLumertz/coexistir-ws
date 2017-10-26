package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Centro;

public interface AdminRepository extends JpaRepository<Centro, Integer> {
	
	public Centro findByIdCentroLike(Integer idCentro);

}
