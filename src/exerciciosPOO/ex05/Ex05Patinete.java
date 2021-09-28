package exerciciosPOO.ex05;

public class Ex05Patinete {
	
	public static void main(String[] args) {
		
		Patinete p1 = new Patinete();
		
		p1.setCor("Azul");
		p1.setTipo("Elétrico");
		p1.setModelo("Infantil");
		
		System.out.println("Cor: " + p1.getCor());
		System.out.println("Tipo: " + p1.getTipo());
		System.out.println("Modelo: " + p1.getModelo());
		
		p1.Freiar();
		p1.Patinar();
	}
}
