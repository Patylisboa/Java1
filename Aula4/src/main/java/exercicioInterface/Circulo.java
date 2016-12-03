package exercicioInterface;

public class Circulo implements AreaCalculavel {
	private double raio;

	public double getArea(){
		return Math.pow(raio, 2)* Math.PI;
	}
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	}
