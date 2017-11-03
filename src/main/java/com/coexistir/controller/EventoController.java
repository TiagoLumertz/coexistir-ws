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

import com.coexistir.model.Evento;
import com.coexistir.repositories.EventoRepository;

@Controller
@RequestMapping("/evento/")
public class EventoController {

	@Autowired
	private EventoRepository eventoRep;
	
	// BUSCAR TODOS OS EVENTOS
	@RequestMapping(value = "", method = RequestMethod.GET)	
	public ResponseEntity<List<Evento>> buscarTodos(){				
		List<Evento> users = eventoRep.findAll();			
		if (users.isEmpty()) {			
			return new ResponseEntity(HttpStatus.NO_CONTENT);			
		}			
		return new ResponseEntity(users, HttpStatus.OK);		
	}
	
	// BUSCAR EVENTOS PELO ID
	@RequestMapping(value = "{idEvento}", method = RequestMethod.GET)
	public ResponseEntity<Evento> buscarEventoPorId(@PathVariable("idEvento") Integer idEvento){
		Evento Evento = eventoRep.findOne(idEvento);
		if (Evento == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(Evento, HttpStatus.OK);
	}
	
	// CADASTRAR EVENTO
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<?> cadastrarEvento(@RequestBody Evento EventoCad, UriComponentsBuilder ucBuilder){
		
		Evento temp = eventoRep.save(EventoCad);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("{idEvento}").buildAndExpand(temp.getIdEvento()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		
	}
	
	// ATUALIZANDO EVENTO
	@RequestMapping(value = "", method=RequestMethod.PUT)
	public ResponseEntity<Evento> atualizarEvento(@RequestBody Evento Evento){		
		eventoRep.save(Evento);		
		return new ResponseEntity<Evento>(Evento, HttpStatus.OK);
	}
		
	// EXCLUINDO CENTRO (POR ID)
	@RequestMapping(value = "{idEvento}", method = RequestMethod.DELETE)
	public ResponseEntity<?> excluirEventoPorId(@PathVariable("idEvento") Integer idEvento){
		Evento e = eventoRep.findOne(idEvento);
		if (e == null) {
			return new ResponseEntity(new CustomErrorType("Não foi possível excluir. " + "O evento com o Id " + idEvento +
					" não foi encontrado."), HttpStatus.NOT_FOUND);
		}
		eventoRep.delete(e);
		return new ResponseEntity<Evento>(e, HttpStatus.OK);
	}	
		
}