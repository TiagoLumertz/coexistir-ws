package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Avaliacao;

<<<<<<< HEAD
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer> {
=======
<<<<<<< HEAD
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer> {
=======
public interface AdminRepository extends JpaRepository<Avaliacao, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
>>>>>>> 0a353a5a931b58927cd872355b7936317f35ca0d
	
	Avaliacao findByIdAvaliacaoLike(Integer idAvaliacao);

}
