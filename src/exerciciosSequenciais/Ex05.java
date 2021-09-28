package exerciciosSequenciais;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		double n2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		double n3 = sc.nextDouble();
		
		System.out.println("A média é: " 
		+ ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 3);
		
		sc.close();
	}
}
