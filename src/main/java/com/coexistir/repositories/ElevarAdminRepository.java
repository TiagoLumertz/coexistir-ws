package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.ElevarAdmin;

public interface ElevarAdminRepository extends JpaRepository<ElevarAdmin, Integer> {
	
	public ElevarAdmin findByIdElevarAdminLike(Integer idElevarAdmin);

}
