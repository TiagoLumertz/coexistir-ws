package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the elevaradmin database table.
 * 
 */
@Entity
@NamedQuery(name="ElevarAdmin.findAll", query="SELECT e FROM ElevarAdmin e")
public class ElevarAdmin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idElevarAdmin;

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

	public ElevarAdmin() {
	}

	public int getIdElevarAdmin() {
		return this.idElevarAdmin;
	}

	public void setIdElevarAdmin(int idElevarAdmin) {
		this.idElevarAdmin = idElevarAdmin;
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