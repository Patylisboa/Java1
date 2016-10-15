package gerenciar.garagem;

import java.util.HashSet;
import java.util.Set;

public class Garagem {
	
	private Set<Veiculo> veiculos = new HashSet<>();
	
	public boolean adicionar(Veiculo veiculo){
		return veiculos.add(veiculo);
		 
		 }
	 
	 public boolean vender(String veiculo){
		return true;
		 }
	 
	 public Veiculo buscar(String veiculo){
		 return null;
	 	 }
	 
	 public String Listar(String veiculo){
		 return veiculo;
	 	 }
	 
	 public String Sair(String veiculo){
		 return veiculo;
	 	 }
}

