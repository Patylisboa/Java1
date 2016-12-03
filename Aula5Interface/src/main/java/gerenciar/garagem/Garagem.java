package gerenciar.garagem;

import java.util.HashSet;
import java.util.Set;

public class Garagem {
	
	private Set<Veiculo> veiculos = new HashSet<>();
	
	public boolean adicionar(Veiculo veiculo){
		return veiculos.add(veiculo);
		 
		 }
	 
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((veiculos == null) ? 0 : veiculos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Garagem other = (Garagem) obj;
		if (veiculos == null) {
			if (other.veiculos != null)
				return false;
		} else if (!veiculos.equals(other.veiculos))
			return false;
		return true;
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

