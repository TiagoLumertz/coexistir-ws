package com.coexistir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.coexistir.model.Usuario;
import com.coexistir.repositories.UsuarioRepository;

@Controller
@RequestMapping("/usuario/")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRep;
	
	// BUSCAR TODOS OS USUÁRIOS
	@RequestMapping(value = "", method = RequestMethod.GET)	
	public ResponseEntity<List<Usuario>> buscarTodos(){				
		List<Usuario> users = usuarioRep.findAll();			
		if (users.isEmpty()) {			
			return new ResponseEntity(HttpStatus.NO_CONTENT);			
		}			
		return new ResponseEntity(users, HttpStatus.OK);		
	}
	
	// BUSCAR USUÁRIOS PELO ID
	@RequestMapping(value = "{idUsuario}", method = RequestMethod.GET)
	public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable("idUsuario") Integer idUsuario){
		Usuario usuario = usuarioRep.findOne(idUsuario);
		if (usuario == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(usuario, HttpStatus.OK);
	}
	
	// CADASTRAR USUÁRIO
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<?> cadastrarUsuario(@RequestBody Usuario usuarioCad, UriComponentsBuilder ucBuilder){
		System.out.println(usuarioCad.getDataNasc());
		Usuario temp = usuarioRep.save(usuarioCad);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("{idUsuario}").buildAndExpand(temp.getIdUsuario()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		
	}
	
	// LOGIN DE USUÁRIO
	@RequestMapping(value = "{apelido}/{senha}", method = RequestMethod.GET)
	public ResponseEntity<Usuario> fazerLogin(@PathVariable String apelido, @PathVariable String senha){		
		Usuario usuario = this.usuarioRep.findByApelidoAndSenhaLike(apelido, senha);
		if (usuario == null) {
			return new ResponseEntity(new CustomErrorType("Login ou senha incorretos."), HttpStatus.OK);
		}
		return new ResponseEntity(usuario, HttpStatus.OK);
	}
		
	
	// ATUALIZANDO USUÁRIO
	@RequestMapping(value = "", method=RequestMethod.PUT)
	public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario){		
		usuarioRep.save(usuario);		
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}
	
	// EXCLUINDO USUÁRIO (POR ID)
	@RequestMapping(value = "{idUsuario}", method = RequestMethod.DELETE)
	public ResponseEntity<?> excluirUsuarioPorId(@PathVariable("idUsuario") Integer idUsuario){
		Usuario u = usuarioRep.findOne(idUsuario);
		if (u == null) {
			return new ResponseEntity(new CustomErrorType("Não foi possível excluir. " + "O usuário com o Id " + idUsuario +
					" não foi encontrado."), HttpStatus.NOT_FOUND);
		}
		usuarioRep.delete(u);
		return new ResponseEntity<Usuario>(u, HttpStatus.OK);
	}	
		
}