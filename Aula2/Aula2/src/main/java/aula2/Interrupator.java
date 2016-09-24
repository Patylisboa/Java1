package aula2;

public class Interrupator {
	Lampada lampada;

	public Interrupator(Lampada lampada) {
		this.lampada = lampada;
	}

	public void apertar() {
		boolean estaLigada = lampada.estaLigada();
		if (estaLigada) {
			lampada.ligar();
		} else {
			lampada.desligar();
		}
	}
}
