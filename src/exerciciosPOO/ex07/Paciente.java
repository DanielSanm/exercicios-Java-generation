package exerciciosPOO.ex07;

public class Paciente {
	
	private String nome;
	private String situacao;
	private int idade;
	private String sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
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
	
	void remediar() {
		System.out.println("O paciente está sendo remediado");
	}
	
	void darAlta() {
		System.out.println("O paciente está recebendo alta");
	}
}
