package imd.modelo;

public class Moto extends Veiculo{
	
	private String marca;
	private String placa;
	private double quilometragem;
	private double cilindradas;
	private String partida;
	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}
	private Boolean alugado;
	 
	
	
	public Boolean getAlugado() {
		return alugado;
	}

	public void setAlugado(Boolean alugado) {
		this.alugado = alugado;
	}

	public void setCilindradas(double cilindradas) {
		this.cilindradas = cilindradas;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public Moto() {
		super("","",0);
		marca = "";
		placa = "";
		quilometragem = 0;
		cilindradas = 0;
		partida = "";
	}

	public void fazerTrocaOleo() {
		System.out.println("O veiculo " + getMarca() + " trocou óleo");
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
	public double getCilindradas() {
		return cilindradas;
	}
	public void setQuantidadeCilindradas(double quantidadeCilindradas) {
		cilindradas = quantidadeCilindradas;
	}
	

}
