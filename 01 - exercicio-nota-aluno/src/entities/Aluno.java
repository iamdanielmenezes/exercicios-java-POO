package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaTotal() {
		return nota1 + nota2 + nota3;
	}
	
	public double pontosQueFaltam() {
		return 60.0 - notaTotal();
	}
	
	public boolean aprovado() {
	    return notaTotal() >= 60.0;
	}
} 
