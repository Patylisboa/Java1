package PadraoEx2;

public class Funcionario {
	private String nome;
	private double salario = 1000;
	private String cargo;
	private double porcentagemBonificacao;
	
	 public Funcionario (String nome, double salario, String cargo,double porcentagemBonificacao ){
		 this.nome = nome;
		 this.salario = salario;
		 this.cargo = cargo;
		 this.porcentagemBonificacao = porcentagemBonificacao;
	 }
	
	 
	public String getNome() {
		return nome;
	}


	public String getCargo() {
		return cargo;
	}


	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		
	if (salario  > this.salario ){
		salario = this.salario;
		
	}else {
		System.out.println("Não pode alterar");
		
	}
		
		this.salario = salario;
	}
	public double getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}
	public void setPorcentagemBonificacao(double porcentagemBonificacao) {
		this.porcentagemBonificacao = porcentagemBonificacao;
	}
}
