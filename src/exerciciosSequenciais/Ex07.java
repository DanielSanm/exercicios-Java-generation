package exerciciosSequenciais;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os coeficientes: ");
		
		System.out.print("A: ");
		int a = sc.nextInt();
		
		System.out.print("B: ");
		int b = sc.nextInt();
		
		System.out.print("C: ");
		int c = sc.nextInt();
		
		System.out.print("D: ");
		int d = sc.nextInt();
		
		System.out.print("E: ");
		int e = sc.nextInt();
		
		System.out.print("F: ");
		int f = sc.nextInt();
		
		int x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		int y = (a * f) - (c * d) / ((a * e) - (b * d));
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		
		sc.close();
		
	}
}
