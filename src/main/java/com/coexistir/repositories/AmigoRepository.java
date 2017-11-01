package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Amigo;

public interface AmigoRepository extends JpaRepository<Amigo, Integer> {
	
	Amigo findByIdAmigoLike(Integer idAmigo);

}
