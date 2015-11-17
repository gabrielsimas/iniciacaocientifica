package br.com.uninove.pojo;

import java.util.List;

public class OrmTurma {
	
	private Integer codigo;
	private Character turma;
	private List<OrmCurso> cursos;
	private List<OrmSerie> series;
	
	public OrmTurma() {
	}

	public OrmTurma(Integer codigo, Character turma, List<OrmCurso> cursos, List<OrmSerie> series) {
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

	public List<OrmCurso> getCursos() {
		return cursos;
	}

	public void setCursos(List<OrmCurso> cursos) {
		this.cursos = cursos;
	}

	public List<OrmSerie> getSeries() {
		return series;
	}

	public void setSeries(List<OrmSerie> series) {
		this.series = series;
	}

	@Override
	public String toString() {
		return "Turma [codigo=" + codigo + ", turma=" + turma + ", cursos=" + cursos + ", series=" + series + "]";
	}
	
}
