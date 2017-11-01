package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

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

	//bi-directional many-to-one association to Amigo
	@OneToMany(mappedBy="usuario")
	private List<Amigo> amigos;

	//bi-directional many-to-one association to Avaliacao
	@OneToMany(mappedBy="usuario")
	private List<Avaliacao> avaliacaos;

	//bi-directional many-to-one association to Centro
	@OneToMany(mappedBy="usuario")
	private List<Centro> centros;

	//bi-directional many-to-one association to Checkin
	@OneToMany(mappedBy="usuario")
	private List<Checkin> checkins;

	//bi-directional many-to-one association to Elevacao
	@OneToMany(mappedBy="usuario")
	private List<Elevacao> elevacaos;

	//bi-directional many-to-one association to Evento
	@OneToMany(mappedBy="usuario")
	private List<Evento> eventos;

	//bi-directional many-to-one association to Leitura
	@OneToMany(mappedBy="usuario")
	private List<Leitura> leituras;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	public List<Amigo> getAmigos() {
		return this.amigos;
	}

	public void setAmigos(List<Amigo> amigos) {
		this.amigos = amigos;
	}

	public Amigo addAmigo(Amigo amigo) {
		getAmigos().add(amigo);
		amigo.setUsuario(this);

		return amigo;
	}

	public Amigo removeAmigo(Amigo amigo) {
		getAmigos().remove(amigo);
		amigo.setUsuario(null);

		return amigo;
	}

	public List<Avaliacao> getAvaliacaos() {
		return this.avaliacaos;
	}

	public void setAvaliacaos(List<Avaliacao> avaliacaos) {
		this.avaliacaos = avaliacaos;
	}

	public Avaliacao addAvaliacao(Avaliacao avaliacao) {
		getAvaliacaos().add(avaliacao);
		avaliacao.setUsuario(this);

		return avaliacao;
	}

	public Avaliacao removeAvaliacao(Avaliacao avaliacao) {
		getAvaliacaos().remove(avaliacao);
		avaliacao.setUsuario(null);

		return avaliacao;
	}

	public List<Centro> getCentros() {
		return this.centros;
	}

	public void setCentros(List<Centro> centros) {
		this.centros = centros;
	}

	public Centro addCentro(Centro centro) {
		getCentros().add(centro);
		centro.setUsuario(this);

		return centro;
	}

	public Centro removeCentro(Centro centro) {
		getCentros().remove(centro);
		centro.setUsuario(null);

		return centro;
	}

	public List<Checkin> getCheckins() {
		return this.checkins;
	}

	public void setCheckins(List<Checkin> checkins) {
		this.checkins = checkins;
	}

	public Checkin addCheckin(Checkin checkin) {
		getCheckins().add(checkin);
		checkin.setUsuario(this);

		return checkin;
	}

	public Checkin removeCheckin(Checkin checkin) {
		getCheckins().remove(checkin);
		checkin.setUsuario(null);

		return checkin;
	}

	public List<Elevacao> getElevacaos() {
		return this.elevacaos;
	}

	public void setElevacaos(List<Elevacao> elevacaos) {
		this.elevacaos = elevacaos;
	}

	public Elevacao addElevacao(Elevacao elevacao) {
		getElevacaos().add(elevacao);
		elevacao.setUsuario(this);

		return elevacao;
	}

	public Elevacao removeElevacao(Elevacao elevacao) {
		getElevacaos().remove(elevacao);
		elevacao.setUsuario(null);

		return elevacao;
	}

	public List<Evento> getEventos() {
		return this.eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public Evento addEvento(Evento evento) {
		getEventos().add(evento);
		evento.setUsuario(this);

		return evento;
	}

	public Evento removeEvento(Evento evento) {
		getEventos().remove(evento);
		evento.setUsuario(null);

		return evento;
	}

	public List<Leitura> getLeituras() {
		return this.leituras;
	}

	public void setLeituras(List<Leitura> leituras) {
		this.leituras = leituras;
	}

	public Leitura addLeitura(Leitura leitura) {
		getLeituras().add(leitura);
		leitura.setUsuario(this);

		return leitura;
	}

	public Leitura removeLeitura(Leitura leitura) {
		getLeituras().remove(leitura);
		leitura.setUsuario(null);

		return leitura;
	}

}