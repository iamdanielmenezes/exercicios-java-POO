package exerciciosRetangulo;

import java.util.Scanner;

import entities.Retangulo;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura e a largura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();  
		
		double area = retangulo.area();
		double perimetro = retangulo.perimetro();
		double diagonal = retangulo.diagonal();
		
		System.out.println("Área: " + area);
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Diagonal: " + diagonal);
		
		sc.close();

	}

}