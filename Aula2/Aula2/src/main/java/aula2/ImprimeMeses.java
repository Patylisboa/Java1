package aula2;

import java.util.Scanner;

public class ImprimeMeses {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Informe o mes  desejado");
			String nomeMes = scanner.next();
			
			switch (nomeMes.toUpperCase()){
			case "JANEIRO":
				System.out.println("janeiro");
			case "FEVEREIRO":
				System.out.println("fevereiro");
			case "MARCO":
				System.out.println("marco");
			case "ABRIL":
				System.out.println("abril");
			case "MAIO":
				System.out.println("maio");
			case "JUNHO":
				System.out.println("junho");
			case "JULHO":
				System.out.println("julho");
			case "AGOSTO":
				System.out.println("Agosto");
			case "SETEMRO":
				System.out.println("setembro");
			case "OUTUBRO":
				System.out.println("outubro");
			case "NOVEMBRO":
				System.out.println("novembro");
			case "DEZEMBRO":
				System.out.println("dezembro");
				break;
			default:
				System.out.println("Este não é um mes válido!");
			}
			scanner.close();
		}

	
	}


