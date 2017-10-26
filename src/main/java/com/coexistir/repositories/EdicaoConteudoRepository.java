package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.EdicaoConteudo;

public interface AdminRepository extends JpaRepository<EdicaoConteudo, Integer> {
	
	public EdicaoConteudo findByIdEdicaoConteudoLike(Integer idEdicaoConteudo);

}