package exerciciosRepetitivos;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		int idadeMenor21 = 0;
		int idadeMaior50 = 0;	
		
		while(idade != -99) {
			
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
			
			if(idade < 21 && idade > 0) {
				idadeMenor21++;
			}else if(idade > 50) {
				idadeMaior50++;
			}
			
		}
		System.out.println("Numero menor que 21: " + idadeMenor21);
		System.out.println("Numero maior que 50: " + idadeMaior50);
		
		sc.close();
	}
}
