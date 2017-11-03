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
import org.springframework.web.util.UriComponentsBuilder;

import com.coexistir.model.Admin;
import com.coexistir.repositories.AdminRepository;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	@Autowired
	private AdminRepository adminRep;
	
	// BUSCAR TODOS OS ADMINS
	@RequestMapping(value = "", method = RequestMethod.GET)	
	public ResponseEntity<List<Admin>> buscarTodos(){				
		List<Admin> users = adminRep.findAll();			
		if (users.isEmpty()) {			
			return new ResponseEntity(HttpStatus.NO_CONTENT);			
		}			
		return new ResponseEntity(users, HttpStatus.OK);		
	}
	
	// BUSCAR ADMINS PELO ID
	@RequestMapping(value = "{idAdmin}", method = RequestMethod.GET)
	public ResponseEntity<Admin> buscarAdminPorId(@PathVariable("idAdmin") Integer idAdmin){
		Admin admin = adminRep.findOne(idAdmin);
		if (admin == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(admin, HttpStatus.OK);
	}
	
	// CADASTRAR ADMIN
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<?> cadastrarAdmin(@RequestBody Admin adminCad, UriComponentsBuilder ucBuilder){
		
		Admin temp = adminRep.save(adminCad);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("{idAdmin}").buildAndExpand(temp.getIdAdmin()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		
	}
	
	// ATUALIZANDO ADMIN
	@RequestMapping(value = "", method=RequestMethod.PUT)
	public ResponseEntity<Admin> atualizarAdmin(@RequestBody Admin admin){		
		adminRep.save(admin);		
		return new ResponseEntity<Admin>(admin, HttpStatus.OK);
	}
	
	// LOGIN DE ADMIN
		@RequestMapping(value = "{apelido}/{senha}", method = RequestMethod.GET)
		public ResponseEntity<Admin> fazerLogin(@PathVariable String apelido, @PathVariable String senha){
			
			Admin admin = this.adminRep.findByApelidoAndSenhaLike(apelido, senha);
			if (admin == null) {
				return new ResponseEntity(new CustomErrorType("Login ou senha incorretos."), HttpStatus.OK);
			}
			return new ResponseEntity(admin, HttpStatus.OK);
		}
	
	// EXCLUINDO ADMIN (POR ID)
	@RequestMapping(value = "{idAdmin}", method = RequestMethod.DELETE)
	public ResponseEntity<?> excluirAdminPorId(@PathVariable("idAdmin") Integer idAdmin){
		Admin u = adminRep.findOne(idAdmin);
		if (u == null) {
			return new ResponseEntity(new CustomErrorType("Não foi possível excluir. " + "O administrador com o Id " + idAdmin +
					" não foi encontrado."), HttpStatus.NOT_FOUND);
		}
		adminRep.delete(u);
		return new ResponseEntity<Admin>(u, HttpStatus.OK);
	}	
		
}