import java.util.Scanner;


public class jogoParImpar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String mensagem;
		
		System.out.println("Digite o nome do jogador1");
		String jogador1 = scanner.next();
		
		System.out.println("Digite o nome do jogador2");
		String jogador2 = scanner.next();
		
		System.out.println("Jogador 1 digite o primeiro numero:");
		int num1= scanner.nextInt();
		
		System.out.println("Jogador 2 digite o primeiro numero:");
		int num2= scanner.nextInt();
		
		
		int result1 = (num1 + num2);
		int resultG = result1 %2;
		mensagem = resultG ==0 ? "O resultado do jogo foi:"+result1 +" O jogador "+jogador1+" Venceu!" : 
								 "O resultado do jogo foi:"+result1 + "O Jogador "+jogador2+" Venceu!";
		System.out.println(mensagem);
		
		scanner.close();
	}

}

	
