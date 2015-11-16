package br.com.uninove.iniciacaocientifica.pojo;

import org.joda.time.LocalTime;

public class Horario {

	private Integer codigo;
	private LocalTime horarioInicial;
	private LocalTime horarioFinal;
	
	public Horario() {
	}

	public Horario(Integer codigo, LocalTime horarioInicial, LocalTime horarioFinal) {
		super();
		this.codigo = codigo;
		this.horarioInicial = horarioInicial;
		this.horarioFinal = horarioFinal;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LocalTime getHorarioInicial() {
		return horarioInicial;
	}

	public void setHorarioInicial(LocalTime horarioInicial) {
		this.horarioInicial = horarioInicial;
	}

	public LocalTime getHorarioFinal() {
		return horarioFinal;
	}

	public void setHorarioFinal(LocalTime horarioFinal) {
		this.horarioFinal = horarioFinal;
	}

	@Override
	public String toString() {
		return "Horario [codigo=" + codigo + ", horarioInicial=" + horarioInicial + ", horarioFinal=" + horarioFinal + "]";
	}
	
	
}
