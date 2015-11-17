package br.com.uninove.pojo;

import java.util.List;

public class OrmDisciplina {
	
	private Integer codigo;
	private String nome;
	private List<OrmProfessor> professores;
	private List<OrmCurso> cursos;
	
	public OrmDisciplina() {
	}
	
	public OrmDisciplina(Integer codigo, String nome, List<OrmProfessor> professores, List<OrmCurso> cursos) {
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

	public List<OrmProfessor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<OrmProfessor> professores) {
		this.professores = professores;
	}

	public List<OrmCurso> getCursos() {
		return cursos;
	}

	public void setCursos(List<OrmCurso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", professores=" + professores + ", cursos=" + cursos + "]";
	}
	
	
}
