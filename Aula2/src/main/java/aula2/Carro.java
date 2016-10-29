package aula2;

public class Carro {
	String marca;
	String modelo;
	String cor;
	int anoFab;
	int velocidade;
	
	public Carro(String marca, String modelo,String cor, int anoFab){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFab = anoFab;
		this.velocidade = 0;
	}
	public void acelerar(){
		velocidade ++;
	}
	public void frear(){
		if(velocidade >0){
			velocidade--;
			
		}
	}
}
