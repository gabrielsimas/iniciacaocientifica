package br.com.uninove.iniciacaocientifica.pojo;

import java.util.List;

public class Campus {
	
	private Integer codigo;
	private String nome;
	private List<Curso> cursos;
	
	public Campus() {
	}

	public Campus(Integer codigo, String nome, List<Curso> cursos) {
		this.codigo = codigo;
		this.nome = nome;
		this.cursos = cursos;
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

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Campus [codigo=" + codigo + ", nome=" + nome + ", cursos=" + cursos + "]";
	}
	
	
}
