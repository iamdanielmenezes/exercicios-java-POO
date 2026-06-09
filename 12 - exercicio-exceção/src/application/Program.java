package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exception.RegrasConta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	try {	
		System.out.println("Digite os dados da conta");
		System.out.print("Numero: ");
		Integer numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String titular = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		double saldo = sc.nextDouble(); 
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta conta = new Conta(numero, titular, saldo, limiteSaque);
		
		System.out.print("Digite o valor de saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.println();
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
	catch (RegrasConta e) {
		System.out.println();
		System.out.println("Erro de saque: " + e.getMessage());
	}
		
		sc.close();
	}

}
