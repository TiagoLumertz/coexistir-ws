package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.ListaAmigos;

public interface AdminRepository extends JpaRepository<ListaAmigos, Integer> {
	
	public ListaAmigos findByIdListaAmigosLike(Integer idListaAmigos);

}
