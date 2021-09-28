package exerciciosPOO.ex06;

public class Ex06Conta {
	
	public static void main(String[] args) {
		
		ContaBanco conta = new ContaBanco();
		
		conta.setBanco("Bradesco");
		conta.setAgencia(423432);
		conta.setConta(4324324);
		conta.setSaldo(3200);
		
		System.out.println("Banco: " + conta.getBanco());
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Conta: " + conta.getConta());
		System.out.println("Saldo: " + conta.getSaldo());
		
		conta.sacar();
		conta.depositar();
		
	}
}
