package br.com.uninove.iniciacaocientifica.pojo;

import java.util.List;

public class Professor {
	
	private Integer codigo;
	private String nome;
	private String email;
	private List<Disciplina> disciplinas;
	private List<Campus> campi;
	private List<Curso> cursos;
	
	public Professor() {
	}

	public Professor(Integer codigo, String nome, String email, List<Disciplina> disciplinas, List<Campus> campi, List<Curso> cursos) {
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

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Campus> getCampi() {
		return campi;
	}

	public void setCampi(List<Campus> campi) {
		this.campi = campi;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Professor [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", disciplinas=" + disciplinas + 
				", campi=" + campi + ", cursos=" + cursos + "]";
	}
	
}
