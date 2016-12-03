package aula2;

public class Lampada {
	int watts;
	String fabricante;
	boolean ligada;
	
	public Lampada(int watts, String fabricante ){
		this.watts = watts;
		this.fabricante = fabricante;
}
	public void ligar() {
		System.out.println("Ligada");
			this.ligada = true;
	}

	public void desligar() {
		System.out.println("Desligada");
			this.ligada = false;
	}
	
	public boolean estaLigada(){
			return ligada;
	}
}


