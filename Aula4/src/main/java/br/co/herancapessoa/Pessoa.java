package br.co.herancapessoa;

public class Pessoa {
	
	//classe mae/atributo
	private String nome;
	
	//aqui meu construtor recebendo nome
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
   //os metodos gtter and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
