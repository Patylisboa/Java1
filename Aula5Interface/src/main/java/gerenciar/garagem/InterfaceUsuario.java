package gerenciar.garagem;

import java.util.Scanner;
import java.util.Set;

public class InterfaceUsuario {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Garagem garagem  = new Garagem();
		
		
		int opcao = scanner.nextInt();
		
		while(opcao != 5){
			if(opcao == 1){
				System.out.println("Marca:");
				String marca = scanner.nextLine();
				
				System.out.println("Modelo:");
				String modelo = scanner.nextLine();
				
				System.out.println("Placa:");
				String placa = scanner.nextLine();
				
				System.out.println("Placa");
				int ano = scanner.nextInt();
				
				System.out.println("Preco");
				double preco = scanner.nextDouble();
				
				Veiculo veiculo = new Veiculo(marca, modelo, placa, ano,preco);
				
				boolean inseriu = garagem.adicionar(veiculo);
				if (!inseriu){
					System.out.println("Placa duplicada");
				}
			}else if (opcao == 2){
				boolean vendeu = garagem.vender(null);
				if(!vendeu){
					System.out.println("Placa não encontrada");
				}
			}else if (opcao == 3){
				Veiculo.veiculo = garagem.buscar(placa);
				if(veiculo != null){
					System.out.println(veiculo);
				}else{
					System.out.println("Veiculo nao encontrado");
				}	
			}else if (opcao == 4){
				System.out.println("Veiculos encontrados: ");
				Set<Veiculo> veiculos = garagem.Listar(veiculo);
				for(Veiculo veiculo : veiculos){
					System.out.println(veiculo);
				}
			}else{
		}
		
		scanner.close();
		
	}
	
   }
}

