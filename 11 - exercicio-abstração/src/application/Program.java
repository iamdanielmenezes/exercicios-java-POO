package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		//lista do tipo pessoa porque vai aceitar suas subclasses tambem (polimorfismo)
		List <Pessoa> list = new ArrayList<>();
		
		System.out.print("Digite o numero de pagadores de impostos: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados do pagador #" + (i+1) + ":");
			System.out.print("Pessoa Física ou Jurídica (F/J)? ");
			sc.nextLine();
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Salario Anual: ");
			double salario = sc.nextDouble();
			if (ch == 'F') {
				System.out.print("Gastos com Saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, salario, gastosSaude));
			}
			if (ch == 'J') {
				System.out.print("Numero de Funcionarios: ");
				int numeroDeFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, salario, numeroDeFuncionarios ));
			}
		}
		
		System.out.println();
		System.out.println("Impostos Pagos: ");
		
		for (Pessoa p : list) {
			System.out.println(p.getNome() + ": " + "$" + String.format("%.2f", p.calcularImposto()));
		}
		
		double soma = 0.0;
		for (Pessoa p : list) {
			soma += p.calcularImposto();
		}
		
		System.out.println();
		System.out.println("Imposto total: $" + String.format("%.2f", soma));
		
		sc.close();
	}
}