package exerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteMain {

	public static void main(String[] args) {
		ArrayList<Produto> produto = new ArrayList<Produto>();
		Scanner scan = new Scanner(System.in);
		int escolha = 0;

		while (escolha != -1) {
			System.out.print("\n-------------------\n" + "1 - Adicionar produtos\n" + "2 - Remover produtos\n"
					+ "3 - Alterar um produto\n" + "4 - Mostrar todos produtos e preços\n\n");

			System.out.print("Digite sua escolha: ");
			escolha = scan.nextInt();
			scan.nextLine();

			switch (escolha) {
			case 1:
				System.out.print("\nDigite o nome do produto: ");
				String nome = scan.nextLine();
				System.out.print("\nDigite o preço do produto: ");
				double preco = scan.nextDouble();
				produto.add(new Produto(nome, preco));

				System.out.println("\nProduto " + nome + " adicionado com sucesso!");
				break;
			case 2:
				System.out.println("\nDigite o nome do produto a remover: ");
				nome = scan.nextLine();
				for (int i = 0; i < produto.size(); i++) {
					if (produto.get(i).getNomeProduto().equals(nome)) {
						produto.remove(i);
						System.out.println("\nO produto " + nome + " foi removido com sucesso!");
					}
				}
				break;
			case 3:
				System.out.print("\nDigite o nome do produto a ser alterado: ");
				nome = scan.nextLine();
				for (int i = 0; i < produto.size(); i++) {
					if (produto.get(i).getNomeProduto().equals(nome)) {
						System.out.println("O produto " + nome + " foi encontrado!, digite o novo nome:");
						String novoNome = scan.nextLine();
						System.out.println("Digite o novo preço:");
						preco = scan.nextDouble();
						produto.get(i).setPreco(preco);
						produto.get(i).setNomeProduto(novoNome);
						System.out.println("\nO produto " + nome + " foi alterado com sucesso!");
					}
				}
				break;
			case 4:
				System.out.println("\n----Produtos----\n");
				for (int i = 0; i < produto.size(); i++) {
					System.out.println("Produto | " + produto.get(i).getNomeProduto() + " | preco: R$"
							+ produto.get(i).getPreco());
				}
				break;
			case -1:
				System.out.println("\nEncerrando programa");
				break;

			default:
				System.out.println("Escolha inexistente");
			}
		}
		scan.close();
	}
}
