package br.co.herancapessoa;
//minha classe pessoa fisica herdou da minha classe pessoa

public class PessoaFisica extends Pessoa{
	
//meu atributo
	private String cpf;
	
//meu construtor recebendo nome da classe mae, e o cpf da propria classe
	public PessoaFisica(String nome, String cpf){
		
//aqui recebe o atributo da classe mae		
		super(nome);
		this.cpf = cpf;
	}
//aqui estao os getter and setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}