import java.util.Scanner;


public class ParImpar {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
			int numero2 =2;
			String mensagem;
			
		System.out.println("Digite um numero");
			int numero = scanner.nextInt();
		
			int resultado = numero % numero2;
				mensagem = resultado == 0 ? "par" : "impar"; 
				System.out.println(mensagem);
		
		scanner.close();
	}

}

