package br.criaequipamentotipo;

public class ExecutaEquipamento {
	
	public static void main(String[] args) {
		
		Televisao televisao  = new Televisao("Sony",2000);
		Impressora impressora  = new Impressora("Epson", 1000,2);
		Cadeira cadeira = new Cadeira("Seila", 100, "Madeira");
		
		//double valorTotal = imprimirPrecosFinais(televisao, cadeira, impressora);
		//System.out.print("Valor total:" + valorTotal);
		
		
		System.out.println("Preco: "+televisao.calcularPrecoFinal()+" Fabricante: "+ televisao.getFabricante());
		System.out.println("Preco: "+impressora.calcularPrecoFinal()+" Fabricante:"+ impressora.getFabricante());
		System.out.println("Preco: "+cadeira.calcularPrecoFinal()+" Fabricante: "+cadeira.getFabricante()+" Material: "+cadeira.getMaterial());
		
		
	}

			/* public static double imprimirPrecosFinais(Equipamento...equipamento){
			 double valorTotal = 0;
			
			 for(Equipamento equipamento : equipamento){
			 System.out.println(equipamento.getClass().getSimpleName()+";" + equipamneto.calcula
			 valorTotal += equipamento.calculaPrecoFinal();
			}
			return valorTotal;*/
			
}
