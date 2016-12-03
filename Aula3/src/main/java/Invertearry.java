import java.util.Scanner;


public class Invertearry {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o array");
		int n = scanner.nextInt();
		int[] numeros = new int[n], numerosInvertidos = new int [n];
		
		for(int i = 0; i < numeros.length; i++){
			System.out.println("Informe o numero na posicao" + i +":" );
			numeros[i] = scanner.nextInt();
		}
			
	}
	}
		
		
		
