package exerciciosCondicionais;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Numero 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Numero 3: ");
		int num3 = sc.nextInt();
		
		if(num1 < num2 && num1 < num3) {
			System.out.print(num1);
			if (num2 < num3) {
				System.out.println(" " + num2 + " " + num3);
			} else {
				System.out.println(" " + num3 + " " + num2);
			}
		}
		if(num2 < num1 && num2 < num3) {
			System.out.print(num2);
			if (num1 < num3) {
				System.out.println(" " + num1 + " " + num3);
			} else {
				System.out.println(" " + num3 + " " + num1);
			}
		}
		if(num3 < num1 && num3 < num2) {
			System.out.print(num3);
			if (num1 < num2) {
				System.out.println(" " + num1 + " " + num2);
			} else {
				System.out.println(" " + num2 + " " + num1);
			}
		}
		
		sc.close();
		
	}
}
