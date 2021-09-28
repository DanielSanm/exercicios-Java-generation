package exerciciosPOO.ex01;

public class Cliente {
	
	private String nome;
	private String email;
	private int telefone;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	void comprar() {
		System.out.println("Cliente comprou ou está comprando alguma coisa...");
	}
	
	void Assinar() {
		System.out.println("Cliente assinou ou está assinando um contrato...");
	}
	
	void cadastro() {
		System.out.println("Cliente está se cadastrando...");
	}
	
	
}
