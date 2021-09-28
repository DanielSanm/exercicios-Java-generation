package exerciciosRepetitivos;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int soma = 0;
		
		do {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			
			soma += num;
			
		} while(num != 0);
		
		System.out.println("Soma total: " + soma);
		
		sc.close();
	}
}
