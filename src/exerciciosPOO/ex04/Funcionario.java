package exerciciosPOO.ex04;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String sexo;
	private double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	void trabalhar() {
		System.out.println("Funcionário está trabalhando...");
	}
	void descansar() {
		System.out.println("Funcionário está descansando...");
	}
}
