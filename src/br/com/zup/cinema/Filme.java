package br.com.zup.cinema;

public class Filme {

	private String titulo ;
    private String genero ;
    private Integer duracao; // em minutos
	private Boolean dublado;
	
	public Filme(String titulo,
			     String genero, 
			     Integer duracao,
			     Boolean dublado) {
		this.titulo = titulo;
		this.genero = genero;
		this.duracao = duracao;
		this.dublado = dublado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Boolean getDublado() {
		return dublado;
	}

	public void setDublado(Boolean dublado) {
		this.dublado = dublado;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", genero=" + genero + ", duracao=" + duracao + ", dublado=" + dublado + "]";
	}
	
}
