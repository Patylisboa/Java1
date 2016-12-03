package ExercicioModificadores;

import java.util.Scanner;

public class Televisao {
	String marca;
	String Modelo;
	
	Scanner scanner = new Scanner(System.in);
	
	
	public void ligar() {
		
		System.out.print("Ligando a tv");
		ajustarVoltagem();
		ligarTela();
		regularDiodo();
	}
	
	public void desligar() {
		
		System.out.print("Desligando a tv");
	}
	
	public void aumentarVolume() {
		
		System.out.print("Aumentando o volume");
	}
	public void diminuirVolume() {
		
		System.out.print("diminuindo volume");
	}
	
	public void diminuirCanal(){
		System.out.println("Diminuir Cnal");
	}
	
	private void ajustarVoltagem (){
		System.out.println("Ajustando voltagem");
	}
	
	private void ligarTela(){
		System.out.println("ligando tela");
	}
	
	private void regularDiodo(){
		System.out.println("regular diogo");
	}
	
}
