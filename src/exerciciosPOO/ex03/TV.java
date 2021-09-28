package exerciciosPOO.ex03;

public class TV {
	
	private String tela;
	private String marca;
	private double preco;
	private int polegadas;
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	
	void ligar() {
		System.out.println("Ligando TV...");
	}
	
	void canal() {
		System.out.println("Mundando o canal da TV...");
	}
}
