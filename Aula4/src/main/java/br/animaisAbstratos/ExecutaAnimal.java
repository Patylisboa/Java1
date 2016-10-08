package br.animaisAbstratos;

public class ExecutaAnimal {
	public static void main(String[] args) {
		Baleia baleia = new Baleia();
		Jacare jacare = new Jacare();
		Veterinario veterinario = new Veterinario();
		Humano humano  = new Humano();
		
		veterinario.examinar(baleia);
		veterinario.examinar(jacare);
		veterinario.examinar(humano);
		veterinario.examinar(veterinario);
		
	}
	
}
