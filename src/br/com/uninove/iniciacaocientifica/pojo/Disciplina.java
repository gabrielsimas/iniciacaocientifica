package br.com.uninove.iniciacaocientifica.pojo;

import java.util.List;

public class Disciplina {
	
	private Integer codigo;
	private String nome;
	private List<Professor> professores;
	private List<Curso> cursos;
	
	public Disciplina() {
	}
	
	public Disciplina(Integer codigo, String nome, List<Professor> professores, List<Curso> cursos) {
		this.codigo = codigo;
		this.nome = nome;
		this.professores = professores;
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

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", professores=" + professores + ", cursos=" + cursos + "]";
	}
	
	
}
