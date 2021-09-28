package exerciciosSequenciais;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos, meses e dias: ");
		
		System.out.print("Anos: ");
		int anos = sc.nextInt();
		
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		System.out.print("Dias: ");
		int dias = sc.nextInt();
		
		int totalDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Total de dias: " + totalDias);
		
		sc.close();
	}
}
