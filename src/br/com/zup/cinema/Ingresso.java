package br.com.zup.cinema;

import java.util.Date;

public class Ingresso {
	
	private static long ultimoCodigo = 1;
	
	private Long codigo;
	private Double valor;
	private Sessao sessao;
	private Cliente cliente;
	
	
	public Ingresso(Double valor, Sessao sessao) {
		this.codigo = ultimoCodigo++;
		this.valor = valor;
		this.sessao = sessao;
	}
	
	public Ingresso(Double valor, Sessao sessao, Cliente cliente) {
		this.codigo = ultimoCodigo++;
		this.valor = valor;
		this.sessao = sessao;
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

	@Override
	public String toString() {
		return "Ingresso [codigo=" + codigo + ", valor=" + valor + ", sessao=" + sessao + ", cliente=" + cliente + "]";
	}

}
