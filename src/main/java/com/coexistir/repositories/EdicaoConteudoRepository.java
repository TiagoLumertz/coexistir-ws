package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.EdicaoConteudo;

<<<<<<< HEAD
public interface EdicaoConteudoRepository extends JpaRepository<EdicaoConteudo, Integer> {
=======
public interface AdminRepository extends JpaRepository<EdicaoConteudo, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
	
	public EdicaoConteudo findByIdEdicaoConteudoLike(Integer idEdicaoConteudo);

}
