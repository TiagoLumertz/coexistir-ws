package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the perguntas database table.
 * 
 */
@Entity
@Table(name="perguntas")
@NamedQuery(name="Pergunta.findAll", query="SELECT p FROM Pergunta p")
public class Pergunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPerguntas;

	private String descricao;

	//bi-directional many-to-one association to Conteudo
	@ManyToOne
	@JoinColumn(name="idConteudo")
	private Conteudo conteudo;

	public Pergunta() {
	}

	public int getIdPerguntas() {
		return this.idPerguntas;
	}

	public void setIdPerguntas(int idPerguntas) {
		this.idPerguntas = idPerguntas;
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