package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the perguntas database table.
 * 
 */
@Entity
<<<<<<< HEAD
@Table(name="Pergunta")
=======
@Table(name="perguntas")
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
@NamedQuery(name="Pergunta.findAll", query="SELECT p FROM Pergunta p")
public class Pergunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
<<<<<<< HEAD
	private int idPergunta;
=======
	private int idPerguntas;
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc

	private String descricao;

	//bi-directional many-to-one association to Conteudo
	@ManyToOne
	@JoinColumn(name="idConteudo")
	private Conteudo conteudo;

	public Pergunta() {
	}

<<<<<<< HEAD
	public int getidPergunta() {
		return this.idPergunta;
	}

	public void setidPergunta(int idPergunta) {
		this.idPergunta = idPergunta;
=======
	public int getIdPerguntas() {
		return this.idPerguntas;
	}

	public void setIdPerguntas(int idPerguntas) {
		this.idPerguntas = idPerguntas;
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Conteudo getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

}