package br.com.uninove.pojo;

import java.util.List;

public class OrmSerie {
	
	private Integer codigo;
	private String nome;
	private List<OrmTurma> turmas;
	
	public OrmSerie() {
	}

	public OrmSerie(Integer codigo, String nome, List<OrmTurma> turmas) {
		this.codigo = codigo;
		this.nome = nome;
		this.turmas = turmas;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<OrmTurma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<OrmTurma> turmas) {
		this.turmas = turmas;
	}

	@Override
	public String toString() {
		return "Serie [codigo=" + codigo + ", nome=" + nome + ", turmas=" + turmas + "]";
	}
	
	
}
