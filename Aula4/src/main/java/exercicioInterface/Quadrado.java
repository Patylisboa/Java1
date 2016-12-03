package exercicioInterface;

public class Quadrado {
	private double lado;
	
	public double getArea(){
		return Math.pow(lado, 2);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
