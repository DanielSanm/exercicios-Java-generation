package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print("N1: ");
				n1[l][c] = sc.nextInt();
				
				System.out.print("N2: ");
				n2[l][c] = sc.nextInt();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n2[l][c] - n1[l][c];
			}
		}
		System.out.println("M1: ");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print("[" + m1[l][c] + "] ");
			}
			System.out.println();
		}
		
		System.out.println("M2: ");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print("[" + m2[l][c] + "] ");
			}
			System.out.println();
		}
		sc.close();
	}
}
