package br.com.simulador;

public abstract class Funcionario {
	private String nome;
	private double salario;
	
	public abstract double getPorcentagemAdicional();
	
	public double getSalarioComBonificacao(){
		return salario *(1 + getPorcentagemAdicional());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
