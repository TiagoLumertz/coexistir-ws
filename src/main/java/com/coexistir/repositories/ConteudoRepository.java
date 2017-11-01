package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Conteudo;

<<<<<<< HEAD
public interface ConteudoRepository extends JpaRepository<Conteudo, Integer> {

	Conteudo findByIdConteudoLike(Integer idConteudo);
=======
<<<<<<< HEAD
public interface ConteudoRepository extends JpaRepository<Conteudo, Integer> {
=======
public interface AdminRepository extends JpaRepository<Conteudo, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
	
	public Conteudo findByIdConteudoLike(Integer idConteudo);
>>>>>>> 0a353a5a931b58927cd872355b7936317f35ca0d

}
