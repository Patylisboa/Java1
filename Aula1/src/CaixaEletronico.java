import java.util.Scanner;


public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor que deseja sacar:");
		int valorSaque = scanner.nextInt();
		int restante = valorSaque;
		
		
		int quantidadeNotas100 = restante / 100;
		restante = restante % 100;
		System.out.println("Quantidade de Notas="+quantidadeNotas100);
		System.out.println("Sobrou="+restante);
		
		
		int quantidadeNotas50 = restante / 50;
		restante = restante % 50;
		System.out.println("Quantidade de notas="+quantidadeNotas50);
		System.out.println("Sobrou"+restante);
		
		int quantidadeNotas20 = restante / 20;
		restante = restante % 20;
		System.out.println(quantidadeNotas20);
		System.out.println(restante);
		
		int quantidadeNotas10 = restante / 10;
		restante = restante % 10;
		System.out.println(quantidadeNotas10);
		System.out.println(restante);
		
		int quantidadeNotas5 = restante / 5;
		restante = restante % 5;
		System.out.println(quantidadeNotas5);
		System.out.println(restante);
		scanner.close();
		}
	}


