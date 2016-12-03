package br.criaequipamentotipo;

public class Equipamento {
	private double preco;
	private String fabricante;
	
	

	public Equipamento(String fabricante, double preco) {
		this.fabricante = fabricante;
		this.preco = preco;
	}
	
	public double calcularPrecoFinal(){
		return this.preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	

	
	
}
