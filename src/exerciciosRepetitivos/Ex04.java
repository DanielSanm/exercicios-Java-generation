package exerciciosRepetitivos;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numPessoa = 0;
		int numPessoasCalmas = 0;
		int numMulheresNervosas = 0;
		int numHomensAgressivos = 0;
		int numOutrosCalmos = 0;
		int numPessoasNervosasMais40 = 0;
		int numPessoasCalmasMenos18 = 0;
		
		while(numPessoa < 3) {
			System.out.println("\nDigite as informa��es: ");
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Sexo (1-feminino / 2-masculino / 3-Outros): ");
			int sexo = sc.nextInt();
			
			System.out.print("Estado psicol�gico (1-Calmo / 2-Nervoso / 3-Agressivo: ");
			int estado = sc.nextInt();
			
			if(estado == 1) {
				numPessoasCalmas++;
			}
			
			if(sexo == 1 && estado == 2) {
				numMulheresNervosas++;
			}
			
			if(sexo == 2 && estado == 3) {
				numHomensAgressivos++;
			}
			
			if(sexo == 3 && estado == 1) {
				numOutrosCalmos++;
			}
			
			if(idade > 40 && estado == 2) {
				numPessoasNervosasMais40++;
			}
			
			if(idade < 18 && estado == 1) {
				numPessoasCalmasMenos18++;
			}
			numPessoa++;
		}
		
		System.out.println("\nNumero de pessoas calmas: " + numPessoasCalmas);
		System.out.println("Numero de mulheres nervosas: " + numMulheresNervosas);
		System.out.println("Numero de homens agressivos: " + numHomensAgressivos);
		System.out.println("Numero de outros calmos: " + numOutrosCalmos);
		System.out.println("Numeros de pessoas nervosas com mais de 40: " + numPessoasNervosasMais40);
		System.out.println("Numeros de pessoas calmas com menos de 18: " + numPessoasCalmasMenos18);
		sc.close();
	}
}
