package array;

import java.util.Scanner;

public class TestarArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numeros[" + i + "] = ");
			numeros[i] = scanner.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			int numero = numeros[i];
			System.out.println(numero);
		}
		for (int numero : numeros) {
			System.out.println(numero);
		}
		scanner.close();
	}
}
