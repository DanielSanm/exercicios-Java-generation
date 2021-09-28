package exerciciosCondicionais;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int numMaior = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três numero: ");
		System.out.print("Numero 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Numero 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Numero 3: ");
		int num3 = sc.nextInt();
		
		//2,3,40
		
		if (num1 > num2 && num1 > num3) {
			numMaior = num1;
		} else if (num2 > num1 && num2 > num3) {
			numMaior = num2;
		} else if (num3 > num1 && num3 > num2) {
			numMaior = num3;
		}
		
		System.out.println("Maior numero é: " + numMaior);
		
		sc.close();
	}
}
