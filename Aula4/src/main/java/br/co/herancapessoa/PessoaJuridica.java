package br.co.herancapessoa;

//herdou da minha classe mae pessoa
public class PessoaJuridica extends Pessoa 
{
	private String cnpj;
//construtor recebendo nome e cnpj herdando nome da classe pessoa
	
	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
