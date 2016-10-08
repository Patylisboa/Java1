package br.com.simulador;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super.setNome(nome);
		super.setSalario(salario);
	}

	

	@Override
	public double getPorcentagemAdicional() {
		return 0.15;
	}
	

}
