package imd.modelo;

public class Carro extends Veiculo{
	private String marca;
	private String placa;
	private double quilometragem;
	private double potencia;
	private double portas;
	private double valorAluguel;
	private Boolean alugado;
	
	public Carro() {
		super("","",0);
		marca = "";
		placa = "";
		quilometragem = 0;
		potencia = 0;
		portas = 0;
		valorAluguel = 0;
		alugado = false;
	}
	
	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getPortas() {
		return portas;
	}

	public void setPortas(double portas) {
		this.portas = portas;
	}

	public Boolean getAlugado() {
		return alugado;
	}

	public void setAlugado(Boolean alugado) {
		this.alugado = alugado;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public void fazerTrocaOleo() {
			System.out.println("O veiculo " + getMarca() + " trocou óleo");
	}
	
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
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
	
	public double getQuilometragem() {
		return quilometragem;
	}

}
