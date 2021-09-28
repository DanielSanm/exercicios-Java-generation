package exerciciosSequenciais;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua idade total em dias: ");
		int idade = sc.nextInt();
		
		int anos = idade / 365;
		int meses = (idade % 365) / 30;
		int dias = (idade % 365)%30;
		
		System.out.printf("Sua idade é: %d anos, %d meses e %d dias",
				anos,meses,dias);
		
		sc.close();
		
		
	}
}
