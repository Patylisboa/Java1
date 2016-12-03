package br.com.simulador;

public class TestaFuncionario {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Fabio",5000.00);
		Supervisor supervisor = new Supervisor("Joze", 3000.00);
		Secretaria secretaria = new Secretaria("Maria",2000.00);
		FolhaPagamento folha = new FolhaPagamento();
		
		folha.calcular(gerente, supervisor, secretaria);
		
	}

}
