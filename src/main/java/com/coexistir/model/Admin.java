package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the admin database table.
 * 
 */
@Entity
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAdmin;

	private String apelido;

	private String cidade;

	@Temporal(TemporalType.DATE)
	@Column(name="data_nasc")
	private Date dataNasc;

	private String email;

	private String genero;

	private String nome;

	@Column(name="pos_religiosa")
	private String posReligiosa;

	private int rg;

	private String senha;

	private String uf;

	//bi-directional many-to-one association to Edicao
	@OneToMany(mappedBy="admin")
	private List<Edicao> edicaos;

	//bi-directional many-to-one association to Elevacao
	@OneToMany(mappedBy="admin")
	private List<Elevacao> elevacaos;

	public Admin() {
	}

	public int getIdAdmin() {
		return this.idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getApelido() {
		return this.apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Date getDataNasc() {
		return this.dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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

	public int getRg() {
		return this.rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public List<Edicao> getEdicaos() {
		return this.edicaos;
	}

	public void setEdicaos(List<Edicao> edicaos) {
		this.edicaos = edicaos;
	}

	public Edicao addEdicao(Edicao edicao) {
		getEdicaos().add(edicao);
		edicao.setAdmin(this);

		return edicao;
	}

	public Edicao removeEdicao(Edicao edicao) {
		getEdicaos().remove(edicao);
		edicao.setAdmin(null);

		return edicao;
	}

	public List<Elevacao> getElevacaos() {
		return this.elevacaos;
	}

	public void setElevacaos(List<Elevacao> elevacaos) {
		this.elevacaos = elevacaos;
	}

	public Elevacao addElevacao(Elevacao elevacao) {
		getElevacaos().add(elevacao);
		elevacao.setAdmin(this);

		return elevacao;
	}

	public Elevacao removeElevacao(Elevacao elevacao) {
		getElevacaos().remove(elevacao);
		elevacao.setAdmin(null);

		return elevacao;
	}

}