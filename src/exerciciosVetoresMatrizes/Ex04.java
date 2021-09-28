package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int [3][3];
		int soma = 0;
		int somaDiag = 0;
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				
				System.out.print("Digite a valaor da [" + l + "][" + c + "]: ");
				matriz[l][c] = sc.nextInt();
				
				soma += matriz[l][c];
				somaDiag = matriz[0][0] + matriz[1][1] + matriz[2][2];
				
			}
		}
		
		System.out.println("Soma total da matriz: " + soma);
		System.out.println("Soma da diagonal principal: " + somaDiag);
		
		sc.close();
	}
}
