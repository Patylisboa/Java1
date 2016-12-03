
import java.util.Scanner;


public class VerificaIdade2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String resultado;
		
		System.out.println("Digite a idade");
		int idadeUm = scanner.nextInt();
		
			resultado = idadeUm >= 18 ? "Maior de idade" : "Menor Idade";
			System.out.println(resultado);
		
		scanner.close();
	}

}
