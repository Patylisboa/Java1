package aula5.list;

import java.util.ArrayList;
import java.util.List;

public class TestarListaPessoa {
	 public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("Ana", "1"));
		pessoas.add(new Pessoa("Joao", "2"));
		pessoas.add(new Pessoa("Maria", "3"));
		pessoas.add(new Pessoa("Paty", "4"));
		pessoas.add(new Pessoa("Marcos", "5"));
		
		boolean contains = pessoas.contains(new Pessoa("Ana", "1"));
		
		int indexOf = 
		
		
		System.out.println("pessoa.size"+pessoas.size());
		
		}

}
