package br.com.zup.cinema;

import java.util.Calendar;
import java.util.Date;

public class TestaBilheteria {
	
	public static void main(String[] args) {
		
		Filme matrix = new Filme("Matrix", "Ficção", 120, true);
		Cliente rafael = new Cliente("Rafael", "111.111.111-01", "rafael@ponte.com.br", 30, "senha dificil");
		
		Date hoje = new Date();
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.HOUR_OF_DAY, 17);
		
		Date as5Horas = calendario.getTime();
		
		Bilheteria bilheteria = new Bilheteria();
		
		Sala sala = new Sala("A1");
		Sessao sessao = new Sessao(sala, as5Horas, matrix);
		double valor = 25.0;
		
		Ingresso ingressoComprado = bilheteria.compraIngresso(sessao, valor);
		
		System.out.println(ingressoComprado);
		
		Ingresso ingressoComprado2 = bilheteria.compraIngresso(sessao, valor, rafael);
		System.out.println(ingressoComprado2);
	}

}
