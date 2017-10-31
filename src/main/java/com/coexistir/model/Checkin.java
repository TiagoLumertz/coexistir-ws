package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
<<<<<<< HEAD
 * The persistent class for the Checkin database table.
=======
 * The persistent class for the checkin database table.
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
 * 
 */
@Entity
@NamedQuery(name="Checkin.findAll", query="SELECT c FROM Checkin c")
public class Checkin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
<<<<<<< HEAD
	private int idCheckin;
=======
	private int idCheckIn;
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc

	@Temporal(TemporalType.DATE)
	private Date data;

	private int idEvento;

	//bi-directional many-to-one association to Centro
	@ManyToOne
	@JoinColumn(name="idCentro")
	private Centro centro;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Checkin() {
	}

<<<<<<< HEAD
	public int getIdCheckin() {
		return this.idCheckin;
	}

	public void setIdCheckin(int idCheckin) {
		this.idCheckin = idCheckin;
=======
	public int getIdCheckIn() {
		return this.idCheckIn;
	}

	public void setIdCheckIn(int idCheckIn) {
		this.idCheckIn = idCheckIn;
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public Centro getCentro() {
		return this.centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}