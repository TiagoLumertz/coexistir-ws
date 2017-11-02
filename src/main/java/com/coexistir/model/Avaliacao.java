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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAvaliacao;

	@Column(name="comentario")
	private String comentarioAvalativo;

	@Column(name="sugestao")
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

	public String getComentarioAvalativo() {
		return this.comentarioAvalativo;
	}

	public void setComentarioAvalativo(String comentarioAvalativo) {
		this.comentarioAvalativo = comentarioAvalativo;
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