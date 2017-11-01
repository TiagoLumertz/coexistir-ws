package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Pergunta;

public interface PerguntaRepository extends JpaRepository<Pergunta, Integer> {
	
	Pergunta findByIdPerguntaLike(Integer idPergunta);

}
