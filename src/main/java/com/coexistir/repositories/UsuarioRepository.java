package com.coexistir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coexistir.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
<<<<<<< HEAD
	Usuario findByIdUsuarioLike(Integer idUsuario);
	Usuario findByApelidoAndSenhaLike(String apelido, String senha);
=======
<<<<<<< HEAD
	Usuario findByIdUsuarioLike(Integer idUsuario);
=======
	public Usuario findByIdUsuarioLike(Integer idUsuario);
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
>>>>>>> 0a353a5a931b58927cd872355b7936317f35ca0d

}
