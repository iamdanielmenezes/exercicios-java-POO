package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			Map<String, Integer> map = new TreeMap<>(); 
			
			String line = br.readLine();
			while (line != null) { 
				String[] fields = line.split(",");
				String nome = fields[0];
				Integer votos = Integer.parseInt(fields[1]);
				
				if (map.containsKey(nome)) {
					int votosAteAgora = map.get(nome);
					map.put(nome, votos + votosAteAgora);
				}
				else {
					map.put(nome, votos);
				}
				
				line = br.readLine();
			}
			
			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			} 
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
	}

}
