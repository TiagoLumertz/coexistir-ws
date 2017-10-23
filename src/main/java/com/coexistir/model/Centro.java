package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the centro database table.
 * 
 */
@Entity
@NamedQuery(name="Centro.findAll", query="SELECT c FROM Centro c")
public class Centro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCentro;

	@Temporal(TemporalType.DATE)
	@Column(name="data_cadastro")
	private Date dataCadastro;

	private String endereco;

	private String nome;

	@Column(name="pos_religiosa")
	private String posReligiosa;

	private int telefone;

	private String tipo;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Checkin
	@OneToMany(mappedBy="centro")
	private List<Checkin> checkins;

	public Centro() {
	}

	public int getIdCentro() {
		return this.idCentro;
	}

	public void setIdCentro(int idCentro) {
		this.idCentro = idCentro;
	}

	public Date getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosReligiosa() {
		return this.posReligiosa;
	}

	public void setPosReligiosa(String posReligiosa) {
		this.posReligiosa = posReligiosa;
	}

	public int getTelefone() {
		return this.telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Checkin> getCheckins() {
		return this.checkins;
	}

	public void setCheckins(List<Checkin> checkins) {
		this.checkins = checkins;
	}

	public Checkin addCheckin(Checkin checkin) {
		getCheckins().add(checkin);
		checkin.setCentro(this);

		return checkin;
	}

	public Checkin removeCheckin(Checkin checkin) {
		getCheckins().remove(checkin);
		checkin.setCentro(null);

		return checkin;
	}

}