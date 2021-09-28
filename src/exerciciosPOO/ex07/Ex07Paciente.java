package exerciciosPOO.ex07;

public class Ex07Paciente {
	
	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		
		paciente1.setNome("Daniel");
		paciente1.setSituacao("Ferido");
		paciente1.setIdade(21);
		paciente1.setSexo("Masculino");
		
		System.out.println("Nome: " + paciente1.getNome());
		System.out.println("Situação: " + paciente1.getSituacao());
		System.out.println("Idade: " + paciente1.getIdade());
		System.out.println("Sexo: " + paciente1.getSexo());
		
		paciente1.darAlta();
		paciente1.remediar();
		
	}
}
