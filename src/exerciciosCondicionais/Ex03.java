package exerciciosCondicionais;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria: Infantil");
		} else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria: Juvenil");
		} else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria: Adulto");
		}
		
		sc.close();
	}
}
