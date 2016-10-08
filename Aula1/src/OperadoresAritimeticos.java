import java.util.Scanner;


public class OperadoresAritimeticos {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		double resultado;
		System.out.print("Didgite o primeiro numero");
		double numero1= scanner.nextDouble();
		System.out.print("Didgite o segundo numero");
		double numero2= scanner.nextDouble();
							
			resultado = numero1 + numero2;
			System.out.println("O resultado da soma é:"+ resultado);
		
			double resultado2;
			resultado2 = numero1 - numero2;
			System.out.println("O resultado da subtracao é:"+ resultado2);
		
			double resultado3;
			resultado3 = numero1 * numero2;
			System.out.println("O resultado da multiplicação é:"+ resultado3);
		
			double resultado4;
			resultado4 = numero1 / numero2;
			System.out.println("O resultado da divisão é:"+ resultado4);
		
			double resultado5;
			resultado5 = numero1 % numero2;
			System.out.println("O resultado da resto divisão é:"+ resultado5);
		
		scanner.close();
	}

}

	


