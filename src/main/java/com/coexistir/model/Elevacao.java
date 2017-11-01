package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the elevacao database table.
 * 
 */
@Entity
@NamedQuery(name="Elevacao.findAll", query="SELECT e FROM Elevacao e")
public class Elevacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idElevacao;

	@Temporal(TemporalType.DATE)
	private Date data;

	//bi-directional many-to-one association to Admin
	@ManyToOne
	@JoinColumn(name="idAdmin")
	private Admin admin;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Elevacao() {
	}

	public int getIdElevacao() {
		return this.idElevacao;
	}

	public void setIdElevacao(int idElevacao) {
		this.idElevacao = idElevacao;
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

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}