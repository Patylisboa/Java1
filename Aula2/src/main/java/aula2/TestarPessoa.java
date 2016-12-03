package aula2;

import java.util.Scanner;

public class TestarPessoa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = scanner.next();
		System.out.println("Digite seu rg:");
		String rg = scanner.next();
		System.out.println("Digite seu cpf");
		String cpf = scanner.next();
		
		Pessoa pessoa = new Pessoa(nome, rg, cpf);
		
		System.out.println(pessoa);
		
		scanner.close();
	}

}
