package exerciciosPOO.ex03;

public class Ex03TV {
	
	public static void main(String[] args) {
		
		TV tv1 = new TV();
		
		tv1.setTela("LED");
		tv1.setMarca("Samsung");
		tv1.setPreco(3000);
		tv1.setPolegadas(32);
		
		System.out.println("Tela: " + tv1.getTela());
		System.out.println("Marca: " + tv1.getMarca());
		System.out.println("Preço: " + tv1.getPreco());
		System.out.println("Polegadas: " + tv1.getPolegadas());
		
		tv1.ligar();
		tv1.canal();
	}
}
