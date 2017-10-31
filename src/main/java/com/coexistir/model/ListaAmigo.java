package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the listaamigo database table.
 * 
 */
@Entity
@Table(name="ListaAmigo")
@NamedQuery(name="ListaAmigo.findAll", query="SELECT l FROM ListaAmigo l")
public class ListaAmigo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idListaAmigo;

	private int idAmigo;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public ListaAmigo() {
	}

	public int getidListaAmigo() {
		return this.idListaAmigo;
	}

	public void setidListaAmigo(int idListaAmigo) {
		this.idListaAmigo = idListaAmigo;
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