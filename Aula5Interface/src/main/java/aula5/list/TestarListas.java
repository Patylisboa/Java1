package aula5.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestarListas {
	public static void main(String[] args) {
		List minhaLista =new ArrayList();
		List minhaOutraLista = new LinkedList();
		
		minhaLista.add("teste");
		minhaLista.add("Outra Coisa");
		minhaLista.add(1);
		
		for(Object object : minhaOutraLista){
			
		}
		
		List<String> minhaListaString = new ArrayList<String>();
		minhaListaString.add("Valor 1");
		minhaListaString.add("Valor 2");
		minhaListaString.add("Valor 3");
		minhaListaString.add("Valor 4");
		minhaListaString.add("Valor 4");
		
		int indexOf = minhaListaString.indexOf("Valor 3");
		System.out.println("Valor 3 esta na posicao" + indexOf);
		
	}

}
