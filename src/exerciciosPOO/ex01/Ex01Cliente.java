package exerciciosPOO.ex01;

public class Ex01Cliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Daniel");
		cliente1.setEmail("daniel@gmail.com");
		cliente1.setTelefone(321983232);
		cliente1.setEndereco("rua da felicidade, 180");
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Email: " + cliente1.getEmail());
		System.out.println("Telefone: " + cliente1.getTelefone());
		System.out.println("Endereço: " + cliente1.getEndereco());
		
		cliente1.comprar();
		cliente1.Assinar();
		cliente1.cadastro();
		
	}
}

