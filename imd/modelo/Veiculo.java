package imd.modelo;

public class Veiculo {
	protected String marca;
	protected String placa;
	protected double valorAluguel;
	
	
	public Veiculo(String marca, String placa, double valorAluguel) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.valorAluguel = valorAluguel;
	}
	
	public void trocaDeOleo() {
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	
	

}
