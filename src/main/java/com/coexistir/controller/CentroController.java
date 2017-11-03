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

import com.coexistir.model.Centro;
import com.coexistir.repositories.CentroRepository;

@Controller
@RequestMapping("/centro/")
public class CentroController {

	@Autowired
	private CentroRepository centroRep;
	
	// BUSCAR TODOS OS USUÁRIOS
	@RequestMapping(value = "", method = RequestMethod.GET)	
	public ResponseEntity<List<Centro>> buscarTodos(){				
		List<Centro> users = centroRep.findAll();			
		if (users.isEmpty()) {			
			return new ResponseEntity(HttpStatus.NO_CONTENT);			
		}			
		return new ResponseEntity(users, HttpStatus.OK);		
	}
	
	// BUSCAR USUÁRIOS PELO ID
	@RequestMapping(value = "{idCentro}", method = RequestMethod.GET)
	public ResponseEntity<Centro> buscarCentroPorId(@PathVariable("idCentro") Integer idCentro){
		Centro Centro = centroRep.findOne(idCentro);
		if (Centro == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(Centro, HttpStatus.OK);
	}
	
	// CADASTRAR USUÁRIO
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<?> cadastrarCentro(@RequestBody Centro CentroCad, UriComponentsBuilder ucBuilder){
		
		Centro temp = centroRep.save(CentroCad);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("{idCentro}").buildAndExpand(temp.getIdCentro()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		
	}
	
	// ATUALIZANDO USUÁRIO
	@RequestMapping(value = "", method=RequestMethod.PUT)
	public ResponseEntity<Centro> atualizarCentro(@RequestBody Centro Centro){		
		centroRep.save(Centro);		
		return new ResponseEntity<Centro>(Centro, HttpStatus.OK);
	}
		
	// EXCLUINDO CENTRO (POR ID)
	@RequestMapping(value = "{idCentro}", method = RequestMethod.DELETE)
	public ResponseEntity<?> excluirCentroPorId(@PathVariable("idCentro") Integer idCentro){
		Centro c = centroRep.findOne(idCentro);
		if (c == null) {
			return new ResponseEntity(new CustomErrorType("Não foi possível excluir. " + "O centro com o Id " + idCentro +
					" não foi encontrado."), HttpStatus.NOT_FOUND);
		}
		centroRep.delete(c);
		return new ResponseEntity<Centro>(c, HttpStatus.OK);
	}	
		
}