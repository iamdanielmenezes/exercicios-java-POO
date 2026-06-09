package entities;

public class Produto {
	private String nome;
	private double preço;
	private int estoque;
	
	//construtores
	public Produto(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	}
	public Produto(String nome, double preço, int estoque) {
		this.nome = nome;
		this.preço = preço;
		this.estoque = estoque;
	}
	
	
	//metodos
	public double preçoTotal() {
		return estoque * preço;
	}
	
	public void addProduto(int quantidade) {
		estoque += quantidade;
	}
	public void removerProduto(int remover) {
		estoque -= remover;
	}
	 
	 
	// getters e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getEstoque() {
		return estoque;
	}
	
	public String toString() {
		return "Produto: "
				+ nome
				+", Preço: "
				+ preço
				+", Estoque: "
				+ estoque
				+", Total: $"
				+ preçoTotal();
	}

}

