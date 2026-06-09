package calculoDolar;

import java.util.Locale;
import java.util.Scanner;
import entities.Conversor;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dolar?: ");
		double valorDolar = sc.nextDouble();
		
		System.out.println("Quantos dolares você vai comprar?: ");
		double quantidade = sc.nextDouble();
		
		double total = Conversor.totalImposto(valorDolar, quantidade);
		
		System.out.printf("Valor a ser pago em reais: %.2f", total);
		
		sc.close();
	}

}
