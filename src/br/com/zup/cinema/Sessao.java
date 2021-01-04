package br.com.zup.cinema;

import java.util.Date;

public class Sessao {
	
	private Date horario;
	private Filme filme;
	private Sala sala;
	
	public Sessao(Sala sala, Date horario, Filme filme) {
		this.sala = sala;
		this.horario = horario;
		this.filme = filme;
	}

	public Date getHorario() {
		return horario;
	}
	
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public Filme getFilme() {
		return filme;
	}
	
}
