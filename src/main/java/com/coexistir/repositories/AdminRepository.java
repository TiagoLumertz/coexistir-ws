package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Admin;
import com.coexistir.model.Usuario;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	Admin findByIdAdminLike(Integer idAdmin);
	Admin findByApelidoAndSenhaLike(String apelido, String senha);

}
