package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;


/**
<<<<<<< HEAD
 * The persistent class for the listaamigo database table.
 * 
 */
@Entity
@Table(name="ListaAmigo")
=======
 * The persistent class for the listaamigos database table.
 * 
 */
@Entity
@Table(name="listaamigos")
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
@NamedQuery(name="ListaAmigo.findAll", query="SELECT l FROM ListaAmigo l")
public class ListaAmigo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
<<<<<<< HEAD
	private int idListaAmigo;
=======
	private int idListaAmigos;
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc

	private int idAmigo;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public ListaAmigo() {
	}

<<<<<<< HEAD
	public int getidListaAmigo() {
		return this.idListaAmigo;
	}

	public void setidListaAmigo(int idListaAmigo) {
		this.idListaAmigo = idListaAmigo;
=======
	public int getIdListaAmigos() {
		return this.idListaAmigos;
	}

	public void setIdListaAmigos(int idListaAmigos) {
		this.idListaAmigos = idListaAmigos;
>>>>>>> 6b8b5875baab6642814421a7d5f37407e8fbcafc
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