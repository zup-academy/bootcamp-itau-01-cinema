package br.com.zup.cinema;

import java.util.Date;

public class Ingresso {
	
	private Long codigo;
	private Double valor;
	private Date horario;
	private String cadeira;
	private Integer sala;
	private Date data;
	private Filme filme;
	private Cliente cliente;
	
	
	public Ingresso(Long codigo, Double valor, Date horario, String cadeira, Integer sala, Date data, Filme filme,
			Cliente cliente) {
		this.codigo = codigo;
		this.valor = valor;
		this.horario = horario;
		this.cadeira = cadeira;
		this.sala = sala;
		this.data = data;
		this.filme = filme;
		this.cliente = cliente;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public Date getHorario() {
		return horario;
	}


	public void setHorario(Date horario) {
		this.horario = horario;
	}


	public String getCadeira() {
		return cadeira;
	}


	public void setCadeira(String cadeira) {
		this.cadeira = cadeira;
	}


	public Integer getSala() {
		return sala;
	}


	public void setSala(Integer sala) {
		this.sala = sala;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Filme getFilme() {
		return filme;
	}


	public void setFilme(Filme filme) {
		this.filme = filme;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Ingresso [codigo=" + codigo + ", valor=" + valor + ", horario=" + horario + ", cadeira=" + cadeira
				+ ", sala=" + sala + ", data=" + data + ", filme=" + filme + ", cliente=" + cliente + "]";
	}
	
	

}
