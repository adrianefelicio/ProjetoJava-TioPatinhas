package projetojava;

public class Usuario {
	
	
	public String nome;
	public int idade;
	public String email;
	public String senha;
	
	public Usuario(String nome, int idade, String email, String senha) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.senha = senha;
	}
	
	public Usuario(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}