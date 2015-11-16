package br.com.uninove.iniciacaocientifica.pojo;

import java.util.List;

public class Turno {
	
	private Integer codigo;
	private Horario horario;
	private List<Curso> cursos;
	
	public Turno() {
	}

	public Turno(Integer codigo, Horario horario, List<Curso> cursos) {
		this.codigo = codigo;
		this.horario = horario;
		this.cursos = cursos;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Turno [codigo=" + codigo + ", horario=" + horario + ", cursos=" + cursos + "]";
	}
	
}
