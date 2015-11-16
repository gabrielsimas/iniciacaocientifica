package br.com.uninove.iniciacaocientifica.pojo;

import java.util.List;

public class Serie {
	
	private Integer codigo;
	private String nome;
	private List<Turma> turmas;
	
	public Serie() {
	}

	public Serie(Integer codigo, String nome, List<Turma> turmas) {
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

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	@Override
	public String toString() {
		return "Serie [codigo=" + codigo + ", nome=" + nome + ", turmas=" + turmas + "]";
	}
	
	
}
