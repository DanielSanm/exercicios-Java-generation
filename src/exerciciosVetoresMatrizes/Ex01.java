package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];
		int maiorPonto = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Pontuação " + (i + 1) + ": ");
			vetor[i] = sc.nextInt();
			
			if(vetor[i] > maiorPonto) {
				maiorPonto = vetor[i];
			}
		}
		System.out.println("Maior pontuação: " + maiorPonto);
		
		sc.close();
	}
}
