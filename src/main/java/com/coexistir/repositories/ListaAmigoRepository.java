package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.ListaAmigo;

public interface ListaAmigoRepository extends JpaRepository<ListaAmigo, Integer> {
	
	public ListaAmigo findByIdListaAmigosLike(Integer idListaAmigo);

}
