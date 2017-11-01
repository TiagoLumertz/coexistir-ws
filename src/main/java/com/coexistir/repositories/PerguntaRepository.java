package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Pergunta;

<<<<<<< HEAD
public interface PerguntaRepository extends JpaRepository<Pergunta, Integer> {
=======
<<<<<<< HEAD
public interface PerguntaRepository extends JpaRepository<Pergunta, Integer> {
=======
public interface AdminRepository extends JpaRepository<Pergunta, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
>>>>>>> 0a353a5a931b58927cd872355b7936317f35ca0d
	
	Pergunta findByIdPerguntaLike(Integer idPergunta);

}
