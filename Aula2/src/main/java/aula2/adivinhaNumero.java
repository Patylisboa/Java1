package aula2;

import java.util.Random;
import java.util.Scanner;

public class adivinhaNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe seu numero:");
		int qtdChutes = 1;
		int num = scanner.nextInt();
		int numero = new Random().nextInt(10)+1;
		
		while(num !=  numero){
			System.out.println("digite outro numero");
			num = scanner.nextInt();
			qtdChutes++;
		}
		/*
			
			for(qtdChutes =1; num != numero; qtdChutes++){	
			System.out.print("digite outro numero");
			num = scanner.nextInt();
		}*/
			System.out.print("Voce Acertou! Quantidade de chutes:"+qtdChutes);
		
		scanner.close();
	}
}

