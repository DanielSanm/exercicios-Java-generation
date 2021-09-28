package exerciciosSequenciais;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a duração dos eventos em segundo: ");
		int evento = sc.nextInt();
		
		int hora = evento / 3600;
		int minutos = (evento / 60) % 60;
		int segundos = (evento % 3600) % 60;
		
		System.out.println(hora + ":" + minutos + ":" + segundos);
		
		sc.close();
	}
}
