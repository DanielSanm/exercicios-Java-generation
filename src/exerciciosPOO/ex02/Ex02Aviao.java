package exerciciosPOO.ex02;

public class Ex02Aviao {
	
	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.setEmpresa("GOL");
		aviao1.setMarca("Boieng");
		aviao1.setPeso(285);
		aviao1.setTamanho(84);
		
		System.out.println("Empresa: " + aviao1.getEmpresa());
		System.out.println("Marca: " + aviao1.getMarca());
		System.out.println("Peso: " + aviao1.GetPeso());
		System.out.println("Tamanho: " + aviao1.getTamanho());
		
		aviao1.decolar();
		aviao1.voando();
	}
}
