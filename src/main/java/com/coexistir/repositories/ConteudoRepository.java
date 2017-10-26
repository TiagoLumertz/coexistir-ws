package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Conteudo;

public interface AdminRepository extends JpaRepository<Conteudo, Integer> {
	
	public Conteudo findByIdConteudoLike(Integer idConteudo);

}
