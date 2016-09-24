package aula2;

import java.util.Scanner;

public class ImprimeDiaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o valor numerico do dia desejado");
		int diaSemana = scanner.nextInt();
		
		switch (diaSemana){
		case 1:
			System.out.print("segunda");
			break;
		case 2:
			System.out.print("terca");
			break;
		case 3:
			System.out.print("quarta");
			break;
		case 4:
			System.out.print("quinta");
			break;
		case 5:
			System.out.print("sexta");
			break;
		case 6:
			System.out.print("sabado");
			break;
		case 7:
			System.out.print("Domingo");
			break;
			
		}
		scanner.close();
	}

}
