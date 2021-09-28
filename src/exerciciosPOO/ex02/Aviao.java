package exerciciosPOO.ex02;

public class Aviao {
	
	private String empresa;
	private String marca;
	private double peso;
	private double tamanho;
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double GetPeso() {
		return peso;
	}
	public void setPeso( double peso) {
		this.peso = peso;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	void decolar() {
		System.out.println("Avião está decolando...");
	}
	
	void voando() {
		System.out.println("Avião está voando...");
	}
}
