import java.util.Scanner;


public class AlunoIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do Aluno");
		String aluno = scanner.next();
		
		System.out.println("Digite a primeira nota:");
		double nota1= scanner.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2= scanner.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		double nota3= scanner.nextDouble();
		
		double media = (nota1+nota2+nota3) / 3;
		
		if(media >= 7){
			System.out.println("Aluno:"+aluno+ " Aprovado:" +media);
		}else if (media <7 && media >= 4){
			System.out.println("Aluno: "+aluno+ " Exame:" +media);
		}else {
			System.out.print("Aluno "+aluno+ " Reprovado:" +media);
		}
		
		scanner.close();
	}

}

	
