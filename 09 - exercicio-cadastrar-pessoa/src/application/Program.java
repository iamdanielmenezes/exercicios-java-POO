package application;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas deseja cadastrar? ");
		int n = sc.nextInt();
		
		ArrayList <Pessoa> list = new ArrayList<>();  
		
		for (int i=0; i<n; i++) {
			System.out.println("Pessoa " + (i+1) + ": " );
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt(); 
			sc.nextLine();
			System.out.print("Cidade: ");
			String cidade = sc.nextLine();
			System.out.println();
			
			Pessoa pessoa = new Pessoa(nome, idade, cidade);
			list.add(pessoa);
		}
		
		System.out.println("Lista de pessoas: ");
		for (Pessoa pessoa : list) {
			System.out.print(pessoa);
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Digite um nome pra buscar: ");
		String buscar = sc.next();
		boolean encontrou = false;
		
		for (Pessoa p : list) {
			if (p.getNome().equals(buscar)) {
				System.out.println(p);
				encontrou = true;
				break;
			}
		}		
			
		if (!encontrou) {
				System.out.println("Pessoa não encontrada!");
			}
		 
		sc.close();
	}

}
