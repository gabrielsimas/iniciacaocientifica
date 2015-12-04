package br.com.uninove.pojo;

import java.util.List;

public class OrmDisciplina {
	
	private Integer cod_disciplina;
	private String disciplina;
	private List<OrmProfessor> professores;
	private List<OrmCurso> cursos;
	
	public OrmDisciplina() {
	}
	
	

	public OrmDisciplina(Integer cod_disciplina, String disciplina, List<OrmProfessor> professores,
			List<OrmCurso> cursos) {
		this.cod_disciplina = cod_disciplina;
		this.disciplina = disciplina;
		this.professores = professores;
		this.cursos = cursos;
	}
	
	



	public Integer getCod_disciplina() {
		return cod_disciplina;
	}



	public void setCod_disciplina(Integer cod_disciplina) {
		this.cod_disciplina = cod_disciplina;
	}



	public String getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
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
		return "Disciplina [cod_disciplina=" + cod_disciplina + ", disciplina=" + disciplina + ", professores=" + professores + ", cursos=" + cursos + "]";
	}
	
	
}
