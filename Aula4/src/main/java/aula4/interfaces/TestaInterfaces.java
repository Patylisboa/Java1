package aula4.interfaces;

public class TestaInterfaces {
	public static void main(String[] args) {
		System.out.println(PrimeiraInterface.MEU_ATRIBUTO);
		
		PrimeiraInterface objeto = new ImplementacaoInterface();
		objeto.fazAlgumaCoisa();
	}

}
