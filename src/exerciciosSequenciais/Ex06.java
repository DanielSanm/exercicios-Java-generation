package exerciciosSequenciais;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os pontos: ");
		
		System.out.print("X1: ");
		int x1 = sc.nextInt();
		
		System.out.print("X2: ");
		int x2 = sc.nextInt();
		
		System.out.print("Y1: ");
		int y1 = sc.nextInt();
		
		System.out.print("Y2: ");
		int y2 = sc.nextInt();
		
		int subx = x2 - x1;
		double potx = Math.pow(subx, 2);
		
		int suby = y2 - y1;
		double poty = Math.pow(suby, 2);
		
		double somaPot = potx + poty;
		
		double d = Math.sqrt(somaPot);
		
		System.out.println("Valor de D: " + d);
		
		sc.close();
	}
}
