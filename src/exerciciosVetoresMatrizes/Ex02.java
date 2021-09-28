package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		int soma = 0;
		int maiorLance = 0;
		int contaMaior = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o lance " + (i + 1) + ": ");
			vetor[i] = sc.nextInt();
			
			if(vetor[i] >= maiorLance) {
				if(vetor[i] == maiorLance) {
					maiorLance = vetor[i];
					contaMaior++;
				} else {
					maiorLance = vetor[i];
					contaMaior = 0;
					contaMaior++;
				}
			}
			soma += vetor[i];
		}
		
		System.out.println("Média: " + soma / 10);
		System.out.println("Quantidades ocerrenciais maior lances: " + contaMaior);
		
		sc.close();
	}
}
