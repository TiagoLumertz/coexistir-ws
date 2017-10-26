package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Pergunta;

public interface AdminRepository extends JpaRepository<Pergunta, Integer> {
	
	public Pergunta findByIdPerguntaLike(Integer idPergunta);

}
