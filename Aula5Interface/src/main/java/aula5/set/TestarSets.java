package aula5.set;

import java.util.HashSet;
import java.util.Set;

public class TestarSets {
	public static void main(String[] args) {
		Set<String> meuSet = new HashSet<>();
		
		meuSet.add("Valor 1");
		meuSet.add("Valor 1");
		meuSet.add("Valor 2");
		
		
		for(String valor : meuSet){
			System.out.println(valor);
		}
	}

}
