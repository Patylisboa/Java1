package exerciciopedagio;


public class CalculaPedagio {
	public double precoPorEixo = 5;
	
	public double calcular(PagaPedagio ptoPedagio){
	 return	ptoPedagio.getqtdEixo() * precoPorEixo;
		}
	
	}
	




