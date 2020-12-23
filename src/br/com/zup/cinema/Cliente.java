package br.com.zup.cinema;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	private Integer idade;
    private String senha;
    
	public Cliente(String nome,
			       String cpf,
			       String email, 
			       Integer idade,
			       String senha) {

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", idade=" + idade + ", senha=" + senha
				+ "]";
	}
	
}
