package br.com.uninove.pojo;

import java.util.List;

public class OrmProfessor {
	
	private Integer codigo;
	private String nome;
	private String email;
	private List<OrmDisciplina> disciplinas;
	private List<OrmCampus> campi;
	private List<OrmCurso> cursos;
	
	public OrmProfessor() {
	}

	public OrmProfessor(Integer codigo, String nome, String email, List<OrmDisciplina> disciplinas, List<OrmCampus> campi, List<OrmCurso> cursos) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.disciplinas = disciplinas;
		this.campi = campi;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<OrmDisciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<OrmDisciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<OrmCampus> getCampi() {
		return campi;
	}

	public void setCampi(List<OrmCampus> campi) {
		this.campi = campi;
	}

	public List<OrmCurso> getCursos() {
		return cursos;
	}

	public void setCursos(List<OrmCurso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Professor [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", disciplinas=" + disciplinas + 
				", campi=" + campi + ", cursos=" + cursos + "]";
	}
	
}
