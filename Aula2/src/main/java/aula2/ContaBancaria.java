package aula2;

public class ContaBancaria {

	private double saldo;

	public ContaBancaria() {
		this.saldo = 0;
	}

	public boolean sacar(double valor) {
		if (valor > saldo) {
			return false;
		}
		saldo -= valor;
		return true;
	}

	public void depositar() {

	}

	public double obterSlado() {
		return saldo;
	}
}
