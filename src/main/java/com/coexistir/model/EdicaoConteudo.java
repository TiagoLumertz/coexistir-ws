package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the edicaoconteudo database table.
 * 
 */
@Entity
@NamedQuery(name="EdicaoConteudo.findAll", query="SELECT e FROM EdicaoConteudo e")
public class EdicaoConteudo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
<<<<<<< HEAD
	private int idEdicaoConteudo;
=======
	private int idEdConteudo;
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc

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

	public EdicaoConteudo() {
	}

<<<<<<< HEAD
	public int getIdEdicaoConteudo() {
		return this.idEdicaoConteudo;
	}

	public void setIdEdicaoConteudo(int idEdicaoConteudo) {
		this.idEdicaoConteudo = idEdicaoConteudo;
=======
	public int getIdEdConteudo() {
		return this.idEdConteudo;
	}

	public void setIdEdConteudo(int idEdConteudo) {
		this.idEdConteudo = idEdConteudo;
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
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