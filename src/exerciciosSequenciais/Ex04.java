package exerciciosSequenciais;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor de A: ");
		int a = sc.nextInt();
		
		System.out.print("Valor de B: ");
		int b = sc.nextInt();
		
		System.out.print("Valor de C: ");
		int c = sc.nextInt();
		
		int r = (a + b) * (a + b);
		int s = (b + c) * (b + c);
		
		int d = (r + s) / 2;
		
		System.out.println("Valor de D: " + d);
		sc.close();
	}
}
