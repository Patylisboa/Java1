import java.util.Scanner;


public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String mensagem;
		
		System.out.println("Digite o nome do Aluno");
		String aluno = scanner.next();
		
		System.out.println("Digite a primeira nota:");
		double nota1= scanner.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2= scanner.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		double nota3= scanner.nextDouble();
		
		double media = (nota1+nota2+nota3) / 3;
		mensagem = media >=7 ? "Aluno: "+ aluno + " Aprovado com:"+ Math.round(media):"Aluno:"+ 
										  aluno + " Reprovado com:"+ Math.round(media);
		System.out.println(mensagem);
		
		scanner.close();
	}

}
