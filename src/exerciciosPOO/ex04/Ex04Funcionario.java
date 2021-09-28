package exerciciosPOO.ex04;

public class Ex04Funcionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Daniel");
		funcionario1.setIdade(21);
		funcionario1.setSexo("Masculino");
		funcionario1.setSalario(2000);
		
		System.out.println("Nome: " + funcionario1.getNome());
		System.out.println("Idade: " + funcionario1.getIdade());
		System.out.println("Sexo: " + funcionario1.getSexo());
		System.out.println("Salário: " + funcionario1.getSalario());
		
		funcionario1.trabalhar();
		funcionario1.descansar();
	}
}
