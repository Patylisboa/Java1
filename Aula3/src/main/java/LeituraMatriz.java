import java.util.Scanner;


public class LeituraMatriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[][] jogadas = new char [3][3];
		
		for(int linha= 0; linha< jogadas.length; linha ++){
			for(int coluna = 0; coluna < jogadas[linha].length; coluna++){
				jogadas[linha][coluna] = scanner.nextLine().charAt(0);
			}
		}
	}
	

}
