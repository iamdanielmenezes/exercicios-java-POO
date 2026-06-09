package exercicioNotaAluno;

import java.util.Scanner;

import entities.Aluno;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno dadosAluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		dadosAluno.nome = sc.nextLine();
		
		System.out.println("Agora digite a nota obtida pelo aluno nos três trimestres do ano: ");
		dadosAluno.nota1 = sc.nextDouble();
		dadosAluno.nota2 = sc.nextDouble();
		dadosAluno.nota3 = sc.nextDouble();
		
		if (dadosAluno.aprovado()) {
			System.out.printf("Aluno: %s, Nota Final: %.2f, Aprovado!!", dadosAluno.nome, dadosAluno.notaTotal());
		} else {
			System.out.printf("Aluno: %s, Nota Final: %.2f. Reprovado, faltam %.2f pontos", dadosAluno.nome, dadosAluno.notaTotal(), dadosAluno.pontosQueFaltam());
		}
		
		sc.close();
		
	}
}