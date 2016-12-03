import java.util.Scanner;


public class VerificaIdade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite a idade");
		int idadeUm = scanner.nextInt();
		boolean resultado = idadeUm >= 18;
		System.out.println(resultado);
		
		
		System.out.print("Digite o primeiro nome");
		String nome1 = scanner.next();
		System.out.print("Digite o segundo nome");
		String nome2 = scanner.next();
		boolean res1 = nome1.equals(nome2);
		
		System.out.print(res1);
		
		scanner.close();
	}

}
