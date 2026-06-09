package exerciciosSalarioFuncionario;

import java.util.Scanner;

import entities.dadosSalario;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		dadosSalario dados = new dadosSalario();

		System.out.println("Digite os Dados do funcionario: Nome, Salario Bruto e Imposto");
		
		dados.nome = sc.next();
		dados.salarioBruto = sc.nextDouble();
		dados.imposto = sc.nextDouble();
		
		System.out.printf("Funcionario: %s, R$%.2f", dados.nome,dados.salarioLiquido());
		
		System.out.println();
		System.out.println("Qual a porcentagem para aumentar o salário?");
		
		dados.porcentagemAumento = sc.nextDouble();
		
		System.out.printf("Dados Atualizados: %s, R$%.2f", dados.nome, dados.salarioAumento());
		
		sc.close();
	}
}
