package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	
	//construtor que vai receber o numero da conta e o titular, dois argumentos
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	//construtor com tres argumento
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	
	//getters e setter, numero e saldo só tem getter porque não pode ser alterado
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	//operação de deposito, a operação faz: saldo += deposito
	public void deposit(double amount) {
		balance += amount;
	}
	
	//operação de saque, a operação tira do saldo a quantia de saque mais 5 de taxa
	public void	withdraw(double amount) {
		balance -= amount + 5.00;
	}
	
	//forma para retornar os dados da conta no programa
	public String toString() {
		return "Conta "
				+ number
				+ ", Titular: "
				+ holder
				+", saldo: $ "
				+ String.format("%.2f", balance);
				
	}
}

