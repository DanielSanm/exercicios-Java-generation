package exercicioPolimorfismo;

import java.util.Scanner;

public class Preguica extends Animal {
	
	public void Subir() {
		System.out.println("A preguiça está subindo a arvore...");
	}
	
	
	public void emitirSom() {
		Scanner sc = new Scanner(System.in);
		
		String teste = sc.nextLine();
		System.out.println(teste);
		sc.close();
	}
}
