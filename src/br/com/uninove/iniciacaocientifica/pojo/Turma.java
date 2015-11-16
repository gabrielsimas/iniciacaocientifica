package br.com.uninove.iniciacaocientifica.pojo;

import java.util.List;

public class Turma {
	
	private Integer codigo;
	private Character turma;
	private List<Curso> cursos;
	private List<Serie> series;
	
	public Turma() {
	}

	public Turma(Integer codigo, Character turma, List<Curso> cursos, List<Serie> series) {
		this.codigo = codigo;
		this.turma = turma;
		this.cursos = cursos;
		this.series = series;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Character getTurma() {
		return turma;
	}

	public void setTurma(Character turma) {
		this.turma = turma;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

	@Override
	public String toString() {
		return "Turma [codigo=" + codigo + ", turma=" + turma + ", cursos=" + cursos + ", series=" + series + "]";
	}
	
}
