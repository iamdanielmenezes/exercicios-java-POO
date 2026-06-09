package entities;

public abstract class Pessoa {

		private String nome;
		private double renda;
		
		public Pessoa() {
		} 

		public Pessoa(String nome, double renda) {
			this.nome = nome;
			this.renda = renda;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getRenda() {
			return renda;
		}

		public void setRenda(double renda) {
			this.renda = renda;
		}
		
		//por ser a classe generica não faz sentido colocar as regras de imposto, apenas nas especificas
		//então fazemos uma classe abstrata
		public abstract double calcularImposto(); 
}
