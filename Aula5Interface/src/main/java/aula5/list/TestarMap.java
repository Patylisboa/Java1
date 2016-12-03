package aula5.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestarMap {

	public static void main(String[] args) {
		Map<String, Pessoa> pessoasPorCpf = new HashMap<>();
		
		pessoasPorCpf.put("0", new Pessoa("Ana", "0"));
		pessoasPorCpf.put("1", new Pessoa("Ju", "1"));
		pessoasPorCpf.put("2", new Pessoa("Pedro", "2"));
		pessoasPorCpf.put("3", new Pessoa("AnMaria", "3"));
		
		System.out.println("Pessoas por CpF.size: "+pessoasPorCpf.size());
		
		
		Pessoa pessoa = pessoasPorCpf.get("0");
		
		System.out.println("Chave 0:" +pessoa.getNome());
		
		
		Set<Entry<String,Pessoa>> entrySet = pessoasPorCpf.entrySet();
		
		for(Entry<String, Pessoa> entry : entrySet){
			System.out.println(entry.getKey()+ ":"+ entry.getValue().getNome());
		}
		
	}
}
