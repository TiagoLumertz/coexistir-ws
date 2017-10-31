package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Leitura;

<<<<<<< HEAD
public interface LeituraRepository extends JpaRepository<Leitura, Integer> {
=======
public interface AdminRepository extends JpaRepository<Leitura, Integer> {
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
	
	public Leitura findByIdLeituraLike(Integer idLeitura);

}
