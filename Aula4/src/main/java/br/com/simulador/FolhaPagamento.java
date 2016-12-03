package br.com.simulador;

public class FolhaPagamento {
	private double valorTotal;

	public void calcular(Funcionario...funcionarios){
		
		for(Funcionario funcionario : funcionarios){
			System.out.println(funcionario.getSalarioComBonificacao());
			valorTotal+= funcionario.getSalarioComBonificacao();
		}
		System.out.println(valorTotal);
	}

}


