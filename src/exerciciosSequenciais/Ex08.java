package exerciciosSequenciais;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Custo de fabrica: ");
		double custoFabr = sc.nextDouble();
		
		double porcDitr = custoFabr * 0.28;
		double imposto = custoFabr * 0.45;
		
		System.out.println("Custo total do carro: " 
		+ (custoFabr + porcDitr + imposto));
		
		sc.close();
	}
}
