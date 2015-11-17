package br.com.uninove.pojo;

import java.util.List;

public class OrmCampus {
	
	private Integer codigo;
	private String nome;
	private List<OrmCurso> cursos;
	
	public OrmCampus() {
	}

	public OrmCampus(Integer codigo, String nome, List<OrmCurso> cursos) {
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

	public List<OrmCurso> getCursos() {
		return cursos;
	}

	public void setCursos(List<OrmCurso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Campus [codigo=" + codigo + ", nome=" + nome + ", cursos=" + cursos + "]";
	}
	
	
}
