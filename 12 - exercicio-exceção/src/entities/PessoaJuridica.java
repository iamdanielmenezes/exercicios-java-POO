package entities;

public class PessoaJuridica extends Pessoa {

	private int numeroDeFuncionarios; 
	
	public PessoaJuridica(String name, double renda, int numeroDeFuncionarios) {
		super(name, renda);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}


	//metodo onde vai calcular imposto
	//se tiver mais que 10 funcionario 14% de imposto
	//se tiver menos que 10 16% de imposto
	@Override
	public double calcularImposto() {
		if (numeroDeFuncionarios > 10) {
			return getRenda() * 0.14;
		}
		else {
			return getRenda() * 0.16;
		}
	} 
}
