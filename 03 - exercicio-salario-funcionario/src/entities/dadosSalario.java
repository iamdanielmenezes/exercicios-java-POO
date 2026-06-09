package entities;

public class dadosSalario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double porcentagemAumento;
	
	public double salarioAumento() {
		return salarioBruto + (salarioBruto * porcentagemAumento / 100.0);
	}

}
