package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Pergunta;

<<<<<<< HEAD
public interface PerguntaRepository extends JpaRepository<Pergunta, Integer> {
=======
public interface AdminRepository extends JpaRepository<Pergunta, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
	
	public Pergunta findByIdPerguntaLike(Integer idPergunta);

}
