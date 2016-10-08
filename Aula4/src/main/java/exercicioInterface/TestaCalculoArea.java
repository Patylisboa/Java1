package exercicioInterface;

public class TestaCalculoArea {
	public static void main(String[] args) {
		
	Circulo circulo = new Circulo();
	Quadrado quadrado = new Quadrado();
	Retangulo retangulo = new Retangulo();
	CalculadorArea calculaArea = new CalculadorArea();
	
	circulo.setRaio(2.3);
	quadrado.setLado(4);
	retangulo.setAltura(3);
	retangulo.setLargura(5);
	
	System.out.println(calculaArea);
	
	}
	

}
