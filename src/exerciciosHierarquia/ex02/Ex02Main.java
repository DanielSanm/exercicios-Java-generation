package exerciciosHierarquia.ex02;

public class Ex02Main {
	
	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		//cachorro
		cachorro1.setNome("Bolinha");
		cachorro1.setIdade(2);
		
		System.out.println("Nome do cachorro: " + cachorro1.getNome());
		System.out.println("A idade de " + cachorro1.getNome() + " �: " 
		+ cachorro1.getIdade());
		cachorro1.CachorroCorre();
		cachorro1.Latir();
		
		System.out.println();
		
		//cavalo
		cavalo1.setNome("Alaz�o");
		cavalo1.setIdade(5);
		
		System.out.println("Nome do cavalo: " + cavalo1.getNome());
		System.out.println("Idade de " + cavalo1.getNome() + " �: " 
		+ cavalo1.getIdade());
		cavalo1.cavaloCorre();
		cavalo1.relinchar();
		
		System.out.println();
		
		//Pregui�a
		preguica1.setNome("Thomas");
		preguica1.setIdade(8);
		
		System.out.println("Nome da pregui�a: " + preguica1.getNome());
		System.out.println("idade de " + preguica1.getNome() + " �: "
		+ preguica1.getIdade());
		
		preguica1.Subir();
		preguica1.gritar();
	}
}
