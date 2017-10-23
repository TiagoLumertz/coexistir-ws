package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the avaliacao database table.
 * 
 */
@Entity
@NamedQuery(name="Avaliacao.findAll", query="SELECT a FROM Avaliacao a")
public class Avaliacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAvaliacao;

	private String comentarioAvaliativo;

	private String sugestao;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Avaliacao() {
	}

	public int getIdAvaliacao() {
		return this.idAvaliacao;
	}

	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public String getcomentarioAvaliativo() {
		return this.comentarioAvaliativo;
	}

	public void setcomentarioAvaliativo(String comentarioAvaliativo) {
		this.comentarioAvaliativo = comentarioAvaliativo;
	}

	public String getSugestao() {
		return this.sugestao;
	}

	public void setSugestao(String sugestao) {
		this.sugestao = sugestao;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}