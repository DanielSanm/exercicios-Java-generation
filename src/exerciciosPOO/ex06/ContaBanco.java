package exerciciosPOO.ex06;

public class ContaBanco {
	
	private String banco;
	private int agencia;
	private int conta;
	private int saldo;
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	void sacar() {
		System.out.println("Sacando dinheiro...");
	}
	
	void depositar() {
		System.out.println("Depositando dinheiro...");
	}
	
}
