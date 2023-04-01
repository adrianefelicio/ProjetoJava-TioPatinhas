package projetojava;

public class UsuarioFinal extends Usuario implements Pessoa {

	UsuarioFinal(String nome, int idade, String email, String senha){
		super(nome, idade, email, senha);
	}
	
	UsuarioFinal(String nome, int idade){
		super(nome, idade);
	}
		
	@Override
	public void infoPessoal() {
		System.out.println("------------Dados do usuario----------- \n* Nome: "
	+getNome()+"\tIdade: "+getIdade()+"\tE-mail: "+getEmail()+" *");
	
	}


	@Override
	public String setNome(String nome) {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return idade;
	}

	@Override
	public int setIdade(int idade) {
		// TODO Auto-generated method stub
		return idade;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public String setNome() {
		// TODO Auto-generated method stub
		return nome;
	}



	

}