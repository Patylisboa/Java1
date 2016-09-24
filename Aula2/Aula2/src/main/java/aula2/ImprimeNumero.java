package aula2;

import java.util.Random;
import java.util.Scanner;

public class ImprimeNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		int qtdPares = 0;
		int quantidadePares =0;
		for(int i =1; i<= numero && quantidadePares<10; i++){
			if (i % 2 ==0);
			System.out.print(i);
			quantidadePares++;
		}
			if(quantidadePares == 10){
			}
		
		}
		
}
