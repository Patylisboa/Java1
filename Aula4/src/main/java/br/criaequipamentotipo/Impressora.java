package br.criaequipamentotipo;


public class Impressora extends Eletronico{
	
	private int pontoPorPolegada;
	
	public Impressora( String fabricante,double preco, int pontoPorPolegada){
		super(fabricante, preco );
		this.pontoPorPolegada = pontoPorPolegada;
	}
	//sobrecreve o metodo que calcula o preco final com 10%
	

		

	public int getPontoPorPolegada() {
		return pontoPorPolegada;
	}

	public void setPontoPorPolegada(int pontoPorPolegada) {
		this.pontoPorPolegada = pontoPorPolegada;
	}
	
	
	public void imprimrir(){
		System.out.println(" Imprimir");
	}
}
