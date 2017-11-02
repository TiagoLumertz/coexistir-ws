package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Usuario findByIdUsuarioLike(Integer idUsuario);
	Usuario findByApelidoAndSenhaLike(String apelido, String senha);

}
