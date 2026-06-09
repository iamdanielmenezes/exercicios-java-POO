package entities;

public class PessoaFisica extends Pessoa{
	
		private double gastosSaude;

		public PessoaFisica(String name, double renda, double gastosSaude) {
			super(name, renda);
			this.gastosSaude = gastosSaude;
		}

		public double getGastosSaude() {
			return gastosSaude;
		}

		public void setGastosSaude(double gastosSaude) {
			this.gastosSaude = gastosSaude;
		}

		
		
		//metodo onde vai calcular imposto
		//se a pessoa recebe menos de 20 mil paga 15% de imposto
		//se for maior paga 25% de imposto
		//se tiver gasto com saude 50% do gasto é abatido no imposto
		
		@Override
		public double calcularImposto () {
			double imposto;
			if (getRenda() < 20000.0) {
				 imposto = getRenda() * 0.15;
			}
			else {
				imposto = getRenda() * 0.25;
			}
			imposto -= gastosSaude * 0.5;
			if (imposto < 0.0) {
				imposto = 0.0;
			}
				return imposto;  
			}
		}

