package exerciciosPOO.ex05;

public class Patinete {
	
	private String cor;
	private String tipo;
	private String modelo;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	void Patinar() {
		System.out.println("O patinando no patinete...");
	}
	
	void Freiar() {
		System.out.println("O patinete está parando...");
	}
}