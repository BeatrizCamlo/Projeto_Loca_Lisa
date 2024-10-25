package imd.controle;

import java.util.ArrayList;

import imd.modelo.Veiculo;


public class Repositorio {
	
	private ArrayList<Veiculo> veiculosEstoque;

	public Repositorio() {
		veiculosEstoque = new ArrayList<>();
	}

	public void adicionarVeiculo(Veiculo veiculo){
		veiculosEstoque.add(veiculo);
	}
	
	public void listarVeiculosEstoque() {
		System.out.println("Lista de Veiculos: ");
		
		for(Veiculo veiculo : veiculosEstoque) {
			System.out.println("Placa: " +  veiculo.getPlaca());
			System.out.println("Marca: " +  veiculo.getMarca());
			System.out.println("Aluguel R$ " + veiculo.getValorAluguel());
			System.out.println();
		}
	}

	public void listarCarrosAlugados() {
		System.out.println("Lista de Carros Alugados: ");

		boolean encontrouCarrosAlugados = false; // Para verificar se encontrou algum carro alugado
		for (Veiculo veiculo : veiculosEstoque) {
			if (veiculo.isAlugado()) {
				System.out.println("Placa: " + veiculo.getPlaca());
				System.out.println("Marca: " + veiculo.getMarca());
				System.out.println("Aluguel R$ " + veiculo.getValorAluguel());
				System.out.println();
				encontrouCarrosAlugados = true; // Encontrou pelo menos um carro alugado
			}
		}

		if (!encontrouCarrosAlugados) {
			System.out.println("Nenhum carro alugado.");
		}
	}
}
