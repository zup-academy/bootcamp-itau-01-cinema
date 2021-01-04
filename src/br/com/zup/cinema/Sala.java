package br.com.zup.cinema;

public class Sala {

	private int totalDeCadeiras = 1;
	
	private String numero;
	
	public Sala(String numero) {
		this.numero = numero;
	}
	
	public int getTotalDeCadeiras() {
		return totalDeCadeiras;
	}

}
