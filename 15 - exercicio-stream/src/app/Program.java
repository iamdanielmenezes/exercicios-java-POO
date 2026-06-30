package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
// Programa que vai ler os dados (nome, email e salário) de funcionários a partir de um arquivo, 
// Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor fornecido pelo usuário.
// Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.	 	 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee (fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
		
		System.out.println("Digite o salario: ");
		double salary = sc.nextDouble();
		
		Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
		
		List<String> emails = list.stream()
				.filter(e -> e.getSalary() > salary)
				.map(e -> e.getEmail())
				.sorted(comp)
				.collect(Collectors.toList());
		
		System.out.println("Email dos funcionarios cujo salario é maior que " + String.format("%.2f",salary) + ": ");
		emails.forEach(System.out::println);
		
		System.out.print("Soma do salario dos funcionarios cujo nome começa com 'M': " );
		
		Double total = list.stream()
				.filter(e -> e.getName().charAt(0) == 'M')
			    .map(Employee::getSalary)
			    .reduce(0.0, (x, y) -> x + y);
		System.out.println(total);
			
		}catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		 
		sc.close();
		
	}

}
