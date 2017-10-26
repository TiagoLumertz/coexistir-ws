package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Leitura;

public interface AdminRepository extends JpaRepository<Leitura, Integer> {
	
	public Leitura findByIdLeituraLike(Integer idLeitura);

}
