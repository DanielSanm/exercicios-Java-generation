package exerciciosCondicionais;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Este numero é par!");
			System.out.println("Raiz quadrada do numero: " + Math.sqrt(num));
		} else {
			System.out.println("Este numero é impar!");
			System.out.println("Numero elevado ao quadrado: " + Math.pow(num, 2));
		}
		
		sc.close();
	}
}
