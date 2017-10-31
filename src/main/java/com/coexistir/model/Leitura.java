package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the leitura database table.
 * 
 */
@Entity
@NamedQuery(name="Leitura.findAll", query="SELECT l FROM Leitura l")
public class Leitura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idLeitura;

	@Temporal(TemporalType.DATE)
	private Date data;

	//bi-directional many-to-one association to Conteudo
	@ManyToOne
	@JoinColumn(name="idConteudo")
	private Conteudo conteudo;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Leitura() {
	}

	public int getIdLeitura() {
		return this.idLeitura;
	}

	public void setIdLeitura(int idLeitura) {
		this.idLeitura = idLeitura;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Conteudo getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}