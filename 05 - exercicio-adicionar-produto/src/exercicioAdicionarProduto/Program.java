package exercicioChat;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		String nome = sc.next();
		System.out.println("Digite o preço do produto: ");
		double preço = sc.nextDouble();
		System.out.println("Digite a quantidade em estoque: ");
		int estoque = sc.nextInt();
		
		Produto produto = new Produto(nome, preço, estoque);
		
		System.out.println();
		System.out.println("Dados do produto: ");
		System.out.println(produto);
	
		System.out.println();
		System.out.println("Digite a quantidade de produtos a serem adicionados no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: ");
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Digite a quantidade de produtos a serem removidos do estoque: ");
		int remover = sc.nextInt();
		produto.removerProduto(remover);
		
		System.out.println();
		System.out.println("Dados atualizados: ");
		System.out.println(produto);
		 
		sc.close();
	}

}
