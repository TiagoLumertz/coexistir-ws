package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the listaamigos database table.
 * 
 */
@Entity
@Table(name="listaamigos")
@NamedQuery(name="ListaAmigo.findAll", query="SELECT l FROM ListaAmigo l")
public class ListaAmigo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idListaAmigos;

	private int idAmigo;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public ListaAmigo() {
	}

	public int getIdListaAmigos() {
		return this.idListaAmigos;
	}

	public void setIdListaAmigos(int idListaAmigos) {
		this.idListaAmigos = idListaAmigos;
	}

	public int getIdAmigo() {
		return this.idAmigo;
	}

	public void setIdAmigo(int idAmigo) {
		this.idAmigo = idAmigo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}