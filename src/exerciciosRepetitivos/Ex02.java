
package exerciciosRepetitivos;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int num = 0;
		int numPar = 0;
		int numImpar = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
			
		}
		
		System.out.println("Quantidade numeros par: " + numPar);
		System.out.println("Quantidade numeros impar: " + numImpar);
		
		sc.close();
	}
}
