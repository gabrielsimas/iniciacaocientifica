package br.com.uninove.pojo;

import java.util.List;

public class OrmTurno {
	
	private Integer codigo;
	private OrmHorario horario;
	private List<OrmCurso> cursos;
	
	public OrmTurno() {
	}

	public OrmTurno(Integer codigo, OrmHorario horario, List<OrmCurso> cursos) {
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

	public OrmHorario getHorario() {
		return horario;
	}

	public void setHorario(OrmHorario horario) {
		this.horario = horario;
	}

	public List<OrmCurso> getCursos() {
		return cursos;
	}

	public void setCursos(List<OrmCurso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Turno [codigo=" + codigo + ", horario=" + horario + ", cursos=" + cursos + "]";
	}
	
}
