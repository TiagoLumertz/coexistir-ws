package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the edicao database table.
 * 
 */
@Entity
@NamedQuery(name="Edicao.findAll", query="SELECT e FROM Edicao e")
public class Edicao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEdicao;

	@Temporal(TemporalType.DATE)
	private Date data;

	//bi-directional many-to-one association to Admin
	@ManyToOne
	@JoinColumn(name="idAdmin")
	private Admin admin;

	//bi-directional many-to-one association to Conteudo
	@ManyToOne
	@JoinColumn(name="idConteudo")
	private Conteudo conteudo;

	public Edicao() {
	}

	public int getIdEdicao() {
		return this.idEdicao;
	}

	public void setIdEdicao(int idEdicao) {
		this.idEdicao = idEdicao;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Conteudo getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

}