package com.coexistir.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the conteudo database table.
 * 
 */
@Entity
@NamedQuery(name="Conteudo.findAll", query="SELECT c FROM Conteudo c")
public class Conteudo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idConteudo;

	@Column(name="nome")
	private String nome;

	@Column(name="descricao")
	private String descricao;

	//bi-directional many-to-one association to Edicao
	@OneToMany(mappedBy="conteudo")
	private List<Edicao> edicaos;

	//bi-directional many-to-one association to Leitura
	@OneToMany(mappedBy="conteudo")
	private List<Leitura> leituras;

	//bi-directional many-to-one association to Pergunta
	@OneToMany(mappedBy="conteudo")
	private List<Pergunta> perguntas;

	public Conteudo() {
	}

	public int getIdConteudo() {
		return this.idConteudo;
	}

	public void setIdConteudo(int idConteudo) {
		this.idConteudo = idConteudo;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Edicao> getEdicaos() {
		return this.edicaos;
	}

	public void setEdicaos(List<Edicao> edicaos) {
		this.edicaos = edicaos;
	}

	public Edicao addEdicao(Edicao edicao) {
		getEdicaos().add(edicao);
		edicao.setConteudo(this);

		return edicao;
	}

	public Edicao removeEdicao(Edicao edicao) {
		getEdicaos().remove(edicao);
		edicao.setConteudo(null);

		return edicao;
	}

	public List<Leitura> getLeituras() {
		return this.leituras;
	}

	public void setLeituras(List<Leitura> leituras) {
		this.leituras = leituras;
	}

	public Leitura addLeitura(Leitura leitura) {
		getLeituras().add(leitura);
		leitura.setConteudo(this);

		return leitura;
	}

	public Leitura removeLeitura(Leitura leitura) {
		getLeituras().remove(leitura);
		leitura.setConteudo(null);

		return leitura;
	}

	public List<Pergunta> getPerguntas() {
		return this.perguntas;
	}

	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}

	public Pergunta addPergunta(Pergunta pergunta) {
		getPerguntas().add(pergunta);
		pergunta.setConteudo(this);

		return pergunta;
	}

	public Pergunta removePergunta(Pergunta pergunta) {
		getPerguntas().remove(pergunta);
		pergunta.setConteudo(null);

		return pergunta;
	}

}