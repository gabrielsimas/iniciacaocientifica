package br.com.uninove.pojo;

import java.util.List;

public class OrmCurso {

	private Integer codigo;
	private String nome;
	private List<OrmCampus> campi;
	private List<OrmTurno> turnos;
	private List<OrmProfessor> professores;
	private List<OrmDisciplina> disciplinas; 
	private List<OrmTurma> turmas;
	
	public OrmCurso() {
	}

	public OrmCurso(Integer codigo, String nome, List<OrmCampus> campi, List<OrmTurno> turnos, List<OrmProfessor> professores, 
			     List<OrmDisciplina> disciplinas, List<OrmTurma> turmas) {
		this.codigo = codigo;
		this.nome = nome;
		this.campi = campi;
		this.turnos = turnos;
		this.professores = professores;
		this.disciplinas = disciplinas;
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

	public List<OrmCampus> getCampi() {
		return campi;
	}

	public void setCampi(List<OrmCampus> campi) {
		this.campi = campi;
	}

	public List<OrmTurno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<OrmTurno> turnos) {
		this.turnos = turnos;
	}

	public List<OrmProfessor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<OrmProfessor> professores) {
		this.professores = professores;
	}

	public List<OrmDisciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<OrmDisciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<OrmTurma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<OrmTurma> turmas) {
		this.turmas = turmas;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", nome=" + nome + ", campi=" + campi + ", turnos=" + turnos + 
				", professores=" + professores + ", disciplinas=" + disciplinas + ", turmas=" + turmas + "]";
	}
	
	
	
}
