package br.criaequipamentotipo;

public class Eletronico extends Equipamento{

	public Eletronico(String fabricante, double preco) {
		super(fabricante, preco);
	}
	public double calcularPrecoFinal(){
		return this.getPreco()*1.1;
	
	
	}
}
