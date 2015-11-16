package br.com.uninove.iniciacaocientifica.pojo;

import java.util.List;

public class Curso {

	private Integer codigo;
	private String nome;
	private List<Campus> campi;
	private List<Turno> turnos;
	private List<Professor> professores;
	private List<Disciplina> disciplinas; 
	private List<Turma> turmas;
	
	public Curso() {
	}

	public Curso(Integer codigo, String nome, List<Campus> campi, List<Turno> turnos, List<Professor> professores, 
			     List<Disciplina> disciplinas, List<Turma> turmas) {
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

	public List<Campus> getCampi() {
		return campi;
	}

	public void setCampi(List<Campus> campi) {
		this.campi = campi;
	}

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", nome=" + nome + ", campi=" + campi + ", turnos=" + turnos + 
				", professores=" + professores + ", disciplinas=" + disciplinas + ", turmas=" + turmas + "]";
	}
	
	
	
}
