package br.com.zup.cinema;

import java.util.Date;

public class Bilheteria {

	// variável static
	
	private static int ingressosVendidos = 0;
	// método para comprar
	
	
	public Ingresso compraIngresso(Sessao sessao, double valor)  {
		
		if(ingressosVendidos >= sessao.getSala().getTotalDeCadeiras()) {
			throw new IllegalStateException("Sala lotada");
		}
		
		Ingresso ingresso = new Ingresso(valor, sessao);
		
		System.out.println("Comprando um ingresso: " + ingresso);
		
		ingressosVendidos++;
		return ingresso;
	}
	
	public Ingresso compraIngresso(Sessao sessao, double valor, Cliente cliente)  {
		
		if(ingressosVendidos >= sessao.getSala().getTotalDeCadeiras()) {
			throw new IllegalStateException("Sala lotada");
		}
		
		
		Ingresso ingresso = new Ingresso(valor, sessao, cliente);
		
		System.out.println("Comprando um ingresso para um cliente: " + ingresso);
		
		ingressosVendidos++;
		return ingresso;
	}
		
}
