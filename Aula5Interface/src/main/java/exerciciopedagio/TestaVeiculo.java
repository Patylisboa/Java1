package exerciciopedagio;

public class TestaVeiculo {

	public static void main(String[] args) {

		Caminhao caminhao = new Caminhao();
		Carro carro = new Carro();
		Moto moto  = new Moto();
		Bicicleta bicicleta = new Bicicleta();
		CalculaPedagio calcPed = new CalculaPedagio();
		
		
		System.out.println(calcPed.calcular(moto));
		System.out.println(calcPed.calcular(caminhao));
		System.out.println(calcPed.calcular(carro));
		
		
	}

}
