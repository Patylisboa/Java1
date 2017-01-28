package br.com.dextraining.domain;

import java.util.ArrayList;
import java.util.List;


public class LivroService {
private static List<Livro> livros = new ArrayList<>();
	

public static void salvar(Livro livro) {
	livros.add(livro);
}
	public static List<Livro> listar() {
		return livros;
	}


	public static Livro buscar(String value){
		for(Livro livro : livros){
			if(livro.getNome().equals(value)){
				return livro;
			}
		}
		return null;
	}
	


}


