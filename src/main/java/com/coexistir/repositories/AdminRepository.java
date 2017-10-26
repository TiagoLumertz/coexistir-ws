package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	public Admin findByIdAdminLike(Integer idAdmin);

}
