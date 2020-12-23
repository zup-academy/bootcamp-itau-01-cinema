package br.com.zup.cinema;

import java.util.Calendar;
import java.util.Date;

public class TestaIngresso {
	
	public static void main(String[] args) {
		
		Filme matrix = new Filme("Matrix", "Ficção", 120, true);
		Cliente rafael = new Cliente("Rafael", "111.111.111-01", "rafael@ponte.com.br", 30, "senha dificil");
		
		Date hoje = new Date();
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.HOUR_OF_DAY, 17);
		
		Date as5Horas = calendario.getTime();
		
		Ingresso ingressoMatrix = new Ingresso(1L, 10.0, as5Horas, "H9", 2, hoje, matrix, rafael);
	
		System.out.println(ingressoMatrix);
	}

}
