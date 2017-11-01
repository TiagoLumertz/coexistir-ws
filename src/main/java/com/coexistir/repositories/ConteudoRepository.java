package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Conteudo;

public interface ConteudoRepository extends JpaRepository<Conteudo, Integer> {

	Conteudo findByIdConteudoLike(Integer idConteudo);

}
