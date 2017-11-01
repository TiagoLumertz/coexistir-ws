package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the checkin database table.
 * 
 */
@Entity
@NamedQuery(name="Checkin.findAll", query="SELECT c FROM Checkin c")
public class Checkin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCheckin;

	@Temporal(TemporalType.DATE)
	private Date data;

	//bi-directional many-to-one association to Centro
	@ManyToOne
	@JoinColumn(name="idCentro")
	private Centro centro;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="idEvento")
	private Evento evento;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Checkin() {
	}

	public int getIdCheckin() {
		return this.idCheckin;
	}

	public void setIdCheckin(int idCheckin) {
		this.idCheckin = idCheckin;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Centro getCentro() {
		return this.centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}