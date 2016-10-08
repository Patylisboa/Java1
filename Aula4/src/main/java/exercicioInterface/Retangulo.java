package exercicioInterface;

public class Retangulo {
	private double largura;
	private double altura;
	
	public double getArea(){
		return largura * altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getAltura(double altura) {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
